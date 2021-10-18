# TODO: 10 (7% Investment Return) Reimplement Exercise 2.12 to use a loop
#  that calculates and displays the amount of money you’ll have each year at
#  the ends of years 1 through 30.


p = 1000  # principal
r = 7  # rate of return

print(f'{"Principal"}{"Rate" :>10}{"Years" :>10}{"Return":>10}')
for year in range(1, 31):
    print(f'{"$":>2}{p}{r:>10}%{year:>10}{"$":>6}{p * (1 + (r / 100)) ** year:.2f}')
