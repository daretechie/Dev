# TODO:  14 (Target Heart-Rate Calculator) While exercising, you can use a heartrate monitor to see that your heart
#  rate stays within a safe range suggested by your doctors and trainers. According to the American Heart Association
#  (AHA) (http://bit.ly/AHATargetHeartRates), the formula for calculating your maximum heart rate in beats per minute
#  is 220 minus your age in years. Your target heart rate is 50–85% of your maximum heart rate. Write a script that
#  prompts for and inputs the user’s age and calculates and displays the user’s maximum heart rate and the range of
#  the user’s target heart rate. [These formulas are estimates provided by the AHA; maximum and target heart rates
#  may vary based on the health, fitness and gender of the individual. Always consult a physician or qualified
#  healthcare professional before beginning or modifying an exercise program.]

print(f"{'Target Heart-Rate Calculator':^60}")
age = int(input('Enter your age in year: '))

max_heart_rate = 220 - age
min_target_heart_rate = max_heart_rate * 50 // 100
max_target_heart_rate = max_heart_rate * 85 // 100

print('Your maximum heart rate is', max_heart_rate, 'beats per minute')
print('Your range of target heart rate is', min_target_heart_rate, 'to', max_target_heart_rate, 'beats per minute')
