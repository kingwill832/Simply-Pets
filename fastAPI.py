import json
from enum import Enum
from fastapi import FastAPI, HTTPException
from pydantic import BaseModel


app = FastAPI()

# Enum for departments
class Department(Enum):
    CATS = "cat"
    DOGS = "dog"
    EXOTIC = "exotic"

# Pydantic model for the Item
class Item(BaseModel):
    name: str
    price: float
    count: int
    id: int
    department: Department

# Load products from the JSON file
def load_items_from_file():
    with open("products.json", "r") as file:
        data = json.load(file)
    return {
        item["id"]: Item(**item) for item in data
    }

# Load the items when the application starts
items = load_items_from_file()

# Endpoint to get all products
@app.get("/")
def index() -> dict[str, dict[int, Item]]:
    return {"items": items}

# Endpoint to get a specific product by its ID
@app.get("/items/{item_id}")
def query_item_by_id(item_id: int) -> Item:
    if item_id not in items:
        raise HTTPException(
            status_code=404, detail=f"Item with id={item_id} does not exist"
        )
    return items[item_id]

# Endpoint to query items based on various parameters
@app.get("/items/")
def query_item_by_parameters(
    name: str | None = None,
    price: float | None = None,
    count: int | None = None,
    department: Department | None = None,
) -> dict[str, list[Item]]:
    def check_item(item: Item) -> bool:
        return all(
            (
                name is None or item.name == name,
                price is None or item.price == price,
                count is None or item.count == count,
                department is None or item.department == department,
            )
        )

    selection = [item for item in items.values() if check_item(item)]
    return {
        "query": {"name": name, "price": price, "count": count, "department": department},
        "selection": selection,
    }

# Endpoint to add a new item
@app.post("/")
def add_item(item: Item) -> dict[str, Item]:
    if item.id in items:
        raise HTTPException(status_code=400, detail=f"Item with id={item.id} already exists.")
    
    items[item.id] = item
    return {"added": item}

# Endpoint to update an existing item
@app.put("/items/{item_id}")
def update_item(
    item_id: int,
    name: str | None = None,
    price: float | None = None,
    count: int | None = None,
    department: Department | None = None,
) -> dict[str, Item]:
    if item_id not in items:
        raise HTTPException(status_code=404, detail=f"Item with id={item_id} does not exist.")
    
    item = items[item_id]
    if name is not None:
        item.name = name
    if price is not None:
        item.price = price
    if count is not None:
        item.count = count
    if department is not None:
        item.department = department

    return {"updated": item}

# Endpoint to delete an item
@app.delete("/items/{item_id}")
def delete_item(item_id: int) -> dict[str, str]:
    if item_id not in items:
        raise HTTPException(status_code=404, detail=f"Item with id={item_id} does not exist.")
    
    del items[item_id]
    return {"message": f"Item with id={item_id} has been deleted."}
