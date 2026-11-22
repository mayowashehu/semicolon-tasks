let a = 15;
let b = 42;
let c = 8;
let d = 23;
let e = 19;

let largest = a;
let smallest = a;

if (b > largest) { largest = b; }
if (c > largest) { largest = c; }
if (d > largest) { largest = d; }
if (e > largest) { largest = e; }

if (b < smallest) { smallest = b; }
if (c < smallest) { smallest = c; }
if (d < smallest) { smallest = d; }
if (e < smallest) { smallest = e; }

console.log("Largest is " + largest);
console.log("Smallest is " + smallest);

