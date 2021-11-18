vowel = ''
cons = ''
vowel_letters = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']

text = input("Enter words: ")

for letter in list(text):
    if letter in vowel_letters:
        vowel += letter
    elif letter not in vowel_letters:
        cons += letter
print(vowel + cons)
