# TODO:8 (Table of Squares and Cubes) Write a script that calculates the squares
#  and cubes of the numbers from 0 to 5. Print the resulting values in table
#  format, as shown below. Use the tab escape sequence to achieve the threecolumn output.


print('Number\tSquares\tCube')
print(0,'\t\t', 0*0, '\t\t',0*0*0)
print(1,'\t\t', 1*1, '\t\t', 1*1*1)
print(2,'\t\t', 2*2,'\t\t', 2*2*2)
print(3,'\t\t', 3*3, '\t\t',3*3*3)
print(4,'\t\t', 4*4, '\t',4*4*4)
print(5,'\t\t', 5*5, '\t',5*5*5)


print(f'\n\n{"Number"}{"Squares":>10}{"Cube" :>10}')
print(f'{0 :^5} {0*0 :>8} {0*0*0 :>10}')
print(f'{1 :^5} {1*1 :>8} {1*1*1 :>10}')
print(f'{2 :^5} {2*2 :>8} {2*2*2 :>10}')
print(f'{3 :^5} {3*3 :>8} {3*3*3 :>10}')
print(f'{4 :^5} {4*4 :>8} {4*4*4 :>10}')
print(f'{5 :^5} {5*5 :>8} {5*5*5 :>10}')