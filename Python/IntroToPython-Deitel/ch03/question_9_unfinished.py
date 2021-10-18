# TODO: (Separating the Digits in an Integer) In Exercise 2.11, you wrote a
#  script that separated a five-digit integer into its individual digits and
#  displayed them. Reimplement your script to use a loop that in each
#  iteration “picks off” one digit (left to right) using the // and % operators,
#  then displays that digit.


print("Separating the Digits in an Integer\n")
digit = int(input('Enter five digit: '))


# if len(digit) == 5:
#     for num in digit:
#         digit = int(digit)
#
#     digit1 = digit // 10000
#     digit2 = digit % 10000 // 1000
#     digit3 = digit % 10000 % 1000 // 100
#     digit4 = digit % 10000 % 1000 % 100 // 10
#     digit5 = digit % 10000 % 1000 % 100 % 10
#     print(f"{digit1}{digit2 :>3}{digit3 :>3}{digit4 :>3}{digit5 :>3}")
# else:
#     print('Please enter five digit.')
#
#
