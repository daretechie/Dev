# TODO: 11 (Miles Per Gallon) Drivers are concerned with the mileage obtained
#  by their automobiles. One driver has kept track of several tankfuls of
#  gasoline by recording miles driven and gallons used for each tankful.
#  Develop a sentinel-controlled-repetition script that prompts the user to
#  input the miles driven and gallons used for each tankful. The script should
#  calculate and display the miles per gallon obtained for each tankful. After
#  processing all input information, the script should calculate and display
#  the combined miles per gallon obtained for all tankfuls (that is, total miles
#  driven divided by total gallons used).

gallon = float(input('Enter the gallons used (-1 to end): '))
total_gallon = []
total_mile = []

while gallon != -1:
    mile = float(input('Enter the miles driven: '))
    total_gallon.append(gallon)
    total_mile.append(mile)
    print(f'The miles/gallon for this tank was {mile / gallon}')
    gallon = float(input('Enter the gallons used (-1 to end): '))

if gallon == -1:
    print(f'\nThe overall average miles/gallon was {sum(total_mile) / sum(total_gallon)}')
