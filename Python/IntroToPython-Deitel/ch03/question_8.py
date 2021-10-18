# TODO: 8 (Arithmetic, Smallest and Largest) In Exercise 2.10, you wrote a
#  script that input three integers, then displayed the sum, average, product,
#  smallest and largest of those values. Reimplement your script with a loop
#  that inputs four integers.
import statistics

number = []
for i in range(1, 5):
    num = int(input(f'Enter number {i}: '))
    number.append(num)

print('\nThe sum is ', sum(number))
print('The product is ', number[0] * number[1] * number[2] * number[3])
print('The average is ', statistics.mean(number))
print('The minimum is ', min(number))
print('The maximum is ', max(number))

