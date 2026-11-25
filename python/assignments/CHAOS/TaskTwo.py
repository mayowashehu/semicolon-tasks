total = 0
count = 0

print("Enter numbers (type -1 to stop):")

while True:
    number = int(input())

    if number == -1:
        break

    total = total + number
    count = count + 1
    average = total / count

    print("Current average is:", average)

print()
