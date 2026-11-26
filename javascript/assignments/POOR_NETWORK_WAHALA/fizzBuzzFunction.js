const fizzBuzz = (n) => {
    if (n% 5 === 0 && n % 3 === 0) {
        return "fizzBuzz";
    } else if (n % 3 === 0 ) {
        return "Fizz";
    }else if ( n % 5 === 0 ) {
        return "Buzz"
    } else {
        return n;
    }
}

console.log(fizzBuzz(15));
