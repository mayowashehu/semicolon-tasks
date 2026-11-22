sum = 0
for count in range(1, 11):
    print(f"Score {count}")
    score = float(input("Enter Score: "))
    sum +=score
    
    if score % 2 == 0:
        sum +=score
    
print(sum)

    
    

     

