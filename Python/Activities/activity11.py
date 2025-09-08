fruitshop={
    "apple": 10,
    "banana": 15,
    "orange": 20
}

value=input("Enter a fruit ").lower()

if value in fruitshop:
    print("Fruit is availale")
else:
    print("Not available")