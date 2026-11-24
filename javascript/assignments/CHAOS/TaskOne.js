const prompt = require('prompt-sync')();

console.log("Three digit numbers that satisfy the condition:");

for (let count = 100; count <= 999; count++) {
    let num = count;
    let sum = 0;

    let digit1 = Math.floor(num / 100);
    let digit2 = Math.floor((num / 10) % 10);
    let digit3 = num % 10;

    sum = (digit1 * digit1) + (digit2 * digit2) + (digit3 * digit3);

    if (sum == count) {
        console.log(count);
    }
}

console.log();
