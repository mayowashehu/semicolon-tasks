const prompt = require('prompt-sync')();

let total = 0;
let count = 0;

console.log("Enter numbers (type -1 to stop):");

while (true) {
    let number = parseInt(prompt());

    if (number == -1) {
        break;
    }

    total = total + number;
    count = count + 1;
    let average = total / count;

    console.log("Current average is: " + average);
}

console.log();
