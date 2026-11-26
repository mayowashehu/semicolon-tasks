const hammingWeight = (n)=>{
    let count = 0
    let tempNum = n;
 let remainder;
    let check = 0;

     if (n <= 0){
            return 0;
        }else if (n === 1){
            return 1;
                }

 for (let round = 0; tempNum > 0; round++){
        remainder = tempNum % 2
        if (remainder === 1){
            count = count + 1;
        } else if (remainder === 0) {
            check = check + 1
        }

        tempNum = (tempNum - remainder)/ 2;

        if (tempNum === 0) {
            break
        }
    }

    return count > 0 ? count : 0;
}
