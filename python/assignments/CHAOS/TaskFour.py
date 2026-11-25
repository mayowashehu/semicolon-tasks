word = input("Enter a string: ")

reverse = ""
length = len(word)

for count in range(length - 1, -1, -1):
    reverse = reverse + word[count]

if word == reverse:
    print(word, "is a palindrome")
else:
    print(word, "is not a palindrome")

print()
