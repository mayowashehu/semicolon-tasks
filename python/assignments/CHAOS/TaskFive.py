text = input("Enter a string: ")

vowels = 0
consonants = 0

text = text.lower()

for count in range(len(text)):
    ch = text[count]

    if ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u':
        vowels = vowels + 1
    elif ch >= 'a' and ch <= 'z':
        consonants = consonants + 1

print("Number of vowels:", vowels)
print("Number of consonants:", consonants)
print()
