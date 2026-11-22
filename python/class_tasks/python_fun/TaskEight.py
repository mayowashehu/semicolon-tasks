sum = 0
count=1
while count <= 10:
    print(f"Score {count}")
    score = float(input("Enter Score between (0-100): "))
    if score < 1 or score > 99:
        print("Enter valid score")
    else:
        sum += score
        count +=1
        
print(sum)

    
    



