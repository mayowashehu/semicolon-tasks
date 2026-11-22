// Estimates: 2,300,000 stones, 2.5 tons average weight, 20 years to build [1.3.1, 1.3.2, 1.3.3]
let stones = 2300000;
let averageWeight = 2.5; // in tons
let years = 20;

let totalWeight = stones * averageWeight;
let weightPerYear = totalWeight / years;
let weightPerHour = weightPerYear / (365 * 24);
let weightPerMinute = weightPerHour / 60;

console.log("Estimated weight built per year: " + weightPerYear + " tons");
console.log("Estimated weight built per hour: " + weightPerHour + " tons");
console.log("Estimated weight built per minute: " + weightPerMinute + " tons");

