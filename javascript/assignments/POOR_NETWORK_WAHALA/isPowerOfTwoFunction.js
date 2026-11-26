const isPowerOfTwo = (n) =>{
    let power = 1;
    for (let round = 1; round < n; round++) {
        if (power === n) {
            return true;
        } else if (power > n){
            return false;
        }
        power *=2;
    }
   return power === n ?  true :  false;
}

console.log(isPowerOfTwo(4))