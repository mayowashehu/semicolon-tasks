sum = 0
for count in range(1, 11):
    print(f"Score {count}")
    score = float(input("Enter Score: "))
    sum +=score
    
    if count % 2 == 0:
        sum +=score
    
print(f"The sum of 2nd, 4th, 6th, 8th, and 10th number is: {sum}");

    
    

