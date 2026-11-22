def temperature_converter(unit, thres_hold, ):
    if  unit == 'F':
        C =(thres_hold - 32) * 5/9
        if C < thres_hold:
            return f"Cold advsiory,{C} Celsius is below the threshold {thres_hold} Fahrenheit "
        else:
            return f"Heat alert! ,{C} Celsius is above the threshold {thres_hold} Fahrenheit"  
    elif unit == 'C':
        F =(thres_hold * 9/5) + 32
        if F < thres_hold:
            return f"Cold advsiory,{F} Fahrenheit is below the threshold {thres_hold} Celsius"
        else:
            return f"Heat alert! ,{F} Fahrenheit is above the threshold {thres_hold} Celsius"  
    

temperature_unit = input("Enter a temperature unit like 'C' or 'F': ")
temperature_value= int(input("Enter a temperature value: "))

if temperature_unit != 'C' or temperature_unit != 'F':
     print("invalid unit")
else:
     print(temperature_converter(temperature_unit, temperature_value))
