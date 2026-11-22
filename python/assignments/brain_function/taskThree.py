def minutes_converter(minutes):
    seconds = 60 * minutes
    hours = minutes/60
    return f"{minutes} min in sec is {seconds} and in hour is {hours}"
    
print(minutes_converter(30))
        
