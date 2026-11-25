print("Three digit numbers that satisfy the condition:")

for count in range(100, 1000):
    num = count
    sum = 0

    digit1 = num // 100
    digit2 = (num // 10) % 10
    digit3 = num % 10

    sum = (digit1 * digit1) + (digit2 * digit2) + (digit3 * digit3)

    if sum == count:
        print(count)

print()
