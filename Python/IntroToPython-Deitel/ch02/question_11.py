# TODO: 11 (Separating the Digits in an Integer) Write a script that inputs a fivedigit integer from the user.
#  Separate the number into its individual digits. Print them separated by three spaces each. For example, if
#  the user types in the number 42339, the script should print 4 2 3 3 9 Assume that the user enters the correct
#  number of digits. Use both the floor division and remainder operations to “pick off” each digit.

print("Separating the Digits in an Integer\n")
digit = input('Enter five digit: ')

if len(digit) == 5:
    digit = int(digit)
    digit1 = digit // 10000
    digit2 = digit % 10000 // 1000
    digit3 = digit % 10000 % 1000 // 100
    digit4 = digit % 10000 % 1000 % 100 // 10
    digit5 = digit % 10000 % 1000 % 100 % 10
    print(f"{digit1}{digit2 :>3}{digit3 :>3}{digit4 :>3}{digit5 :>3}")
else:
    print('Please enter five digit.')


