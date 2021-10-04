# TODO: 12 (7% Investment Return) Some investment advisors say that it’s reasonable to expect a 7% return over
#  the long term in the stock market. Assuming that you begin with $1000 and leave your money invested, calculate
#  and display how much money you’ll have after 10, 20 and 30 years. Use the following formula for determining these
#  amounts: a = p(1 + r)^n where:
#  p is the original amount invested (i.e., the principal of $1000),
#  r is the annual rate of return (7%),
#  n is the number of years (10, 20 or 30) and
#  a is the amount on deposit at the end of the nth year.

p = 1000  # principal
r = 7  # rate of return
n = [10, 20, 30]  # number of years

a1 = p * (1 + (r / 100)) ** n[0]
a2 = p * (1 + (r / 100)) ** n[1]
a3 = p * (1 + (r / 100)) ** n[2]

print(f'{"Principal"}{"Rate" :>10}{"Years" :>10}{"Return":>10}')
print(f"${p:^5}{r:>10}%{n[0]:>10}{round(a1, 2):>12}")
print(f"${p:^5}{r:>10}%{n[1]:>10}{round(a2, 2):>12}")
print(f"${p:^5}{r:>10}%{n[2]:>10}{round(a3, 2):>12}")
