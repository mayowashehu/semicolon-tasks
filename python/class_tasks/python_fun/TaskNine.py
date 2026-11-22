sum = 0
for count in range(1, 11):
    print(f"Score {count}")
    score = float(input("Enter Score between (0-100): "))
    if score < 1 or score > 99:
        continue
    sum += score
        
print(sum)

    

