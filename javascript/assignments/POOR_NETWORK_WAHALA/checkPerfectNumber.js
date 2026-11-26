const checkPerfectNumber = (number)=>{
    let sum = 0;
     if (number <= 1){
            return false;
        }

    for (let divisible = 1; divisible < number; divisible++){
        let check = number % divisible;
        if (check === 0){
            sum += divisible;
        }
    }

    return sum === number? true : false;
}