const prompt = require('prompt-sync')();

let baseSalary = 5000;
let target = 30000;
let sales = 0;
let commission = 0;
let totalIncome = 0;

while (totalIncome < target) {
    sales = sales + 100;

    if (sales <= 5000) {
        commission = sales * 0.06;
    } else if (sales <= 10000) {
        commission = (5000 * 0.06) + ((sales - 5000) * 0.08);
    } else {
        commission = (5000 * 0.06) + (5000 * 0.08) + ((sales - 10000) * 0.10);
    }

    totalIncome = baseSalary + commission;
}

console.log("Minimum sales needed is approximately: " + sales);
console.log("Total income at that point: " + totalIncome);
console.log();
