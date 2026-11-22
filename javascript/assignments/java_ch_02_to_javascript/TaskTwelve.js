// 2026 estimates: ~8.30 billion population and ~0.85% annual growth rate [1.2.1, 1.2.9]
let population = 8300678396;
let growthRate = 0.0085;

for (let year = 1; year <= 5; year++) {
  population *= (1 + growthRate);
  console.log("Year " + year + ": " + Math.round(population));
}

