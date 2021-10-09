# This is a Guess the Number game.
from random import randint

guessesTaken = 0

print('Hello! Welcome to the Guess the Number Game!\n\nWhat is your Name?')
myName = input(">> ")

number = randint(1, 100)
print('Well, ' + myName + ', I am thinking of a number between 1 and 100.\nYou only have six lives to guess right')

for guessesTaken in range(6):
    print('Take a guess.')  # Four spaces in front of "print"
    guess = int(input('>> '))

    if guess < number:
        print('Your guess is too low.')

    if guess > number:
        print('Your guess is too hight')

    if guess == number:
        break

if guess == number:
    guessesTaken = str(guessesTaken + 1)
    print('Good job, ' + myName + '! You guessed my number in' + guessesTaken + ' guesses!')

if guess != number:
    number = str(number)
    print('Nope! The number I was thinking of was ' + number + '.')
