# TODO: 1 (Validating User Input) Modify the script of Fig3.3. to validate its
#  inputs. For any input, if the value entered is other than 1 or 2, keep looping
#  until the user enters a correct value. Use one counter to keep track of the
#  number of passes, then calculate the number of failures after all the user’s
#  inputs have been received.


"""Using nested control statements to analyze examination results."""

# initialize variables
passes = 0  # number of passes
failures = 0  # number of failures

result = int(input('Enter result (1=pass, 2=fail) and -1 to end: '))

while result != -1:
    if result != 1 or result != 2:
        # print("Oops! 1 and 2 Only")
        if result == 1:
            passes = passes + 1
        elif result == 2:
            failures = failures + 1

    result = int(input('Enter result (1=pass, 2=fail) and -1 to end: '))

# termination phase
print('Passed:', passes)
print('Failed:', failures)

if passes > 8:
    print('Bonus to instructor')
