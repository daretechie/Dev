# TODO: 7 (Table of Squares and Cubes) In Exercise 2.8, you wrote a script to
#  calculate the squares and cubes of the numbers from 0 through 5, then
#  printed the resulting values in table format. Reimplement your script using
#  a for loop and the f-string capabilities

print(f'{"Number"}{"Squares":>10}{"Cube":>10}')
for num in range(6):
    print(f'{num:>3}{num**2:>10}{num**3:>12}')