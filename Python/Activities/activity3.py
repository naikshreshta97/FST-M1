user1=input("User1: Select one option: Rock, Paper, Scissors- ")
user2=input("User2: Select one option: Rock, Paper, Scissors- ")
if user1==user2:
      print("Play again!")
elif user1=="Rock":
    if user2=="Paper":
        print("User2 beats User1")
    else:
        print("User1 beats User2")
elif user1=="Paper":
    if user2=="Rock":
        print("User1 beats User2")
    else:
        print("User2 beats User1")
elif user1=="Scissors":
    if user2=="Rock":
        print("User2 beats User1")
    else:
        print("User1 beats User2")
else:
        print("Enter a valid input")

    