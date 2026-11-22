def reverse_word(word):

    reverse =" "
    for char in word:
        reverse = char + reverse
        
    return reverse
    
print(reverse_word("Yamski!"))
