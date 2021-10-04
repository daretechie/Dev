# TODO: 13 (How Big Can Python Integers Be?) We’ll answer this question later in the book. For now, use the
#  exponentiation operator ** with large and very large exponents to produce some huge integers and assign those to
#  the variable number to see if Python accepts them. Did you find any integer value that Python won’t accept?


"""
It is difficult to say at this level. It is accepting all big digits but slower in operation
"""
big_int = 5555555555555536666666666662222 ** 99999
print(big_int)