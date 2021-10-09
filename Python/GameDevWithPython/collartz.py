def collartz(number):
    while number != 1:
        if number % 2 == 0:
            number = number // 2
            print(number)
        elif number % 2 == 1:
            number = 3 * number + 1
            print(number)


def calculateAgain():
    print('Do you want to calculate another collatz sequence?')
    input('>>').lower().startswith('Y')


print('Calculate collatz sequence')
while True:
    try:
        number = int(input('>> '))
        collartz(number)
        break
    except ValueError:
        print('invalid')
