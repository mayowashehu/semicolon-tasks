base_salary = 5000
target = 30000
sales = 0
commission = 0
total_income = 0

while total_income < target:
    sales = sales + 100

    if sales <= 5000:
        commission = sales * 0.06
    elif sales <= 10000:
        commission = (5000 * 0.06) + ((sales - 5000) * 0.08)
    else:
        commission = (5000 * 0.06) + (5000 * 0.08) + ((sales - 10000) * 0.10)

    total_income = base_salary + commission

print("Minimum sales needed is approximately:", sales)
print("Total income at that point:", total_income)
print()
