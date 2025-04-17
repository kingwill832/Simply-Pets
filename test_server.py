import requests

print(requests.get("http://127.0.0:8092/items/2").json())
