const reverseInteger =(number)=>{
    let reversed = 0
    let isNegative = false
    let tempNum = number;
     if (number === 0){
            return 0;
        }else if(number < 0){
            isNegative = true;
            tempNum = number * -1;
        }

    for (let step = 0; tempNum > 0; step++){
        let lastDigit = tempNum % 10;
        reversed = reversed * 10 + lastDigit;
        tempNum = (tempNum -lastDigit) / 10;

        if (tempNum === 0){
            break;
        }
    }

    const finalResult = isNegative ?reversed * -1: reversed;
    return finalResult;
}