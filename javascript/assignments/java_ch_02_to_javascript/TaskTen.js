let n1 = -4;
let n2 = 0;
let n3 = 8;
let n4 = -1;
let n5 = 3;

let negative = 0;
let positive = 0;
let zeros = 0;

if (n1 < 0) { negative++; }
if (n1 > 0) { positive++; }
if (n1 === 0) { zeros++; }

if (n2 < 0) { negative++; }
if (n2 > 0) { positive++; }
if (n2 === 0) { zeros++; }

if (n3 < 0) { negative++; }
if (n3 > 0) { positive++; }
if (n3 === 0) { zeros++; }

if (n4 < 0) { negative++; }
if (n4 > 0) { positive++; }
if (n4 === 0) { zeros++; }

if (n5 < 0) { negative++; }
if (n5 > 0) { positive++; }
if (n5 === 0) { zeros++; }

console.log("Negative: " + negative);
console.log("Positive: " + positive);
console.log("Zeros: " + zeros);

