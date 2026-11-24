const prompt = require('prompt-sync')();

let text = prompt("Enter a string: ");

let vowels = 0;
let consonants = 0;

text = text.toLowerCase();

for (let count = 0; count < text.length; count++) {
    let ch = text.charAt(count);

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowels = vowels + 1;
    } else if (ch >= 'a' && ch <= 'z') {
        consonants = consonants + 1;
    }
}

console.log("Number of vowels: " + vowels);
console.log("Number of consonants: " + consonants);
console.log();
