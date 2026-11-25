str = input("Enter a string: ")
result = ""

for count in range(len(str)):
    if count % 2 == 0:
        result = result + str[count]

print("Characters at even indexes:", result)
