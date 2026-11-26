const mySqrt = (n)=>{
    let tempSqrt;
    let lastCount;
    let trial =1;
     if (n<0){
            return null;
        }else if(n<2){
            return n;
        }
    for ( ; trial < n; trial++){
       

        if ( tempSqrt > n ){
              let stepCountDown = lastCount -1;
             const result= stepCountDown * stepCountDown < n ? stepCountDown : trial 
            return result;


        }


         if(trial*trial === n){
            return trial;
        }

       
        tempSqrt = trial * trial;
        lastCount = trial;

       
    }
}

console.log(mySqrt(65))