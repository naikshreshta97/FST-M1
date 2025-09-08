list1=[1,2,3,4,5]
list2=[6,7,8,9]
list3=[]

	
for num in list1:
    if (num % 2 != 0):
        list3.append(num)
        
# Iterate through first list to get even elements
for num in list2:
    if (num % 2 == 0):
        list3.append(num)
 
# Print result
print("result List is:")
print(list3)