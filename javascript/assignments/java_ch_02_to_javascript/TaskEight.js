let number = 42339;

let digit1 = Math.trunc(number / 10000);
let digit2 = Math.trunc((number % 10000) / 1000);
let digit3 = Math.trunc((number % 1000) / 100);
let digit4 = Math.trunc((number % 100) / 10);
let digit5 = number % 10;

console.log(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);

