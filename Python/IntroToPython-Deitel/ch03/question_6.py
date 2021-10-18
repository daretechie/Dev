# TODO: Create a script that plays the part of the independent computer, giving its
#   user a simple medical diagnosis. The script should prompt the user with
#  'What is your problem?' When the user answers and presses Enter,
#  the script should simply ignore the user’s input, then prompt the user again
#  with 'Have you had this problem before (yes or no)?' If the
#  user enters 'yes', print 'Well, you have it again.' If the user
#  answers 'no', print 'Well, you have it now.'

question1 = input('What is your problem? ')
question2 = input('Have you had this problem before (yes or no)? ')

if question2 is 'yes'.lower():
    print('Well, you have it again.')
else:
    print('Well, you have it now.')
