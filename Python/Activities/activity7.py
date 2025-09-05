numbers=[10,20,4,5]

sum=0
for number in numbers:
    sum+=number

print("The sum is:", sum)


numinput=input("Enter numbers with comma:").split(",")
sum1=0
for num in numinput:
    sum1+=int(num)
print(sum1)
