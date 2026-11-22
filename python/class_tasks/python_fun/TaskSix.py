sum = 0
average =0
valid_count=0
for count in range(1, 11):
    print(f"Score {count}")
    score = float(input("Enter Score: "))
    sum +=score
    
    if score % 2 == 0:
        sum +=score
        valid_count +=1
        
average = sum / valid_count    
print(average)

    
    


