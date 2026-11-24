const prompt = require('prompt-sync')();

let word = prompt("Enter a string: ");

let reverse = "";
let length = word.length;

for (let count = length - 1; count >= 0; count--) {
    reverse = reverse + word.charAt(count);
}

if (word == reverse) {
    console.log(word + " is a palindrome");
} else {
    console.log(word + " is not a palindrome");
}

console.log();
