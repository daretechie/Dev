# TODO: 10 (Arithmetic, Smallest and Largest) Write a script that inputs three integers from
#  the user. Display the sum, average, product, smallest and largest of the numbers. Note that
#  each of these is a reduction in functionalstyle programming.

print('Program to display the sum, average, product, smallest and largest of the numbers')
number1 = int(input('Enter the first number: '))
number2 = int(input('Enter the second number: '))
number3 = int(input('Enter the third number: '))

print('\nThe sum is ', (number1 + number3 + number2))
print('The product is ', number3 * number2 * number1)
print('The average is', (number3 + number2 + number1) / 3)
print('The smallest is', min(number1, number2, number3))
print('The largest is', max(number3, number2, number1))
