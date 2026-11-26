const isPalindromeNumber = (number)=>{
 let reversed = 0;
 let tempNum = number
  let lastDigit

    if (number < 0){
        return false;
    } else if (number < 10){
        return true;
    }

    for ( ; tempNum > 0; ){
        lastDigit = tempNum % 10;
        reversed = reversed * 10 + lastDigit;
        tempNum = (tempNum -lastDigit)/ 10
    }

    if (reversed === number) {
        return true;
    }
    return false;
}
