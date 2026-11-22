def vowel_counter(word):
    
    vowels = "aeiou"
    count = 0
    vowelChecker = ""
    for char in word:
        for words in vowels:
            if char in words and char not in vowelChecker:
                vowelChecker = char + vowelChecker
                count +=1
    print(vowelChecker)
    return count
     
print(vowel_counter("Pineapple"))
     
