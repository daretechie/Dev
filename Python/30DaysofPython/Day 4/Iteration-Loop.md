# Day 4 - Iteration & Loops
_Loop is when codes are repeated_



### The `for` loop:
```python

>>> my_list = [1,2,3,4,5]
>>> my_list[0]
1
>>> my_list[1]
2
>>> my_list[2]
3
>>> my_list[3]
4
>>> my_list[4]
5
>>> for my_var in my_list:
...     print(my_var)
... 
1
2
3
4
5
>>> my_var
5

# Note the indented code below the for statement
>>> for i in "abc":
... print(i)
  File "<stdin>", line 2
    print(i)
    ^
IndentationError: expected an indented block
>>> 
>>> for i in "abc":
...     print(i)
...    print(i)
  File "<stdin>", line 3
    print(i)
           ^
IndentationError: unindent does not match any outer indentation level
>>> for i in "abc":
...    print(i)
...    print(i)
... 
a
a
b
b
c
c
>>> "abc"[1]
'b'
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> for x in 10:
...     print(x)
... 
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: 'int' object is not iterable
>>> for x in "10":
...    print(x)
... 
1
0

# range() is used to iterate not iterable data type like number
>>> for x in range(0, 10):
...     print(x)
... 
0
1
2
3
4
5
6
7
8
9
>>> user_1 = {'username': 'jmitchel3', 'id': 1}
>>> user_2 = {'username': 'abc', 'id': 2}
>>> my_users = [user_1, user_2]
>>> for user in my_users:
...     print(user)
... 
{'username': 'jmitchel3', 'id': 1}
{'username': 'abc', 'id': 2}
>>> for user in my_users:
...     print(user['username'])
... 
jmitchel3
abc

>>> # Error when the key isn't in the dict
>>> for user in my_users:
...     print(user['email'])
... 
Traceback (most recent call last):
  File "<stdin>", line 2, in <module>
KeyError: 'email'

>>> user_2 = {'username': 'abc', 'id': 2, 'email': 'abc@abc.abc'}
>>> print(my_users)
[{'username': 'jmitchel3', 'id': 1}, {'username': 'abc', 'id': 2}]
>>> my_users = [user_1, user_2]
>>> print(my_users)
[{'username': 'jmitchel3', 'id': 1}, {'username': 'abc', 'id': 2, 'email': 'abc@abc.abc'}]
>>> for user in my_users:
...     print(user['email'])
... 
Traceback (most recent call last):
  File "<stdin>", line 2, in <module>
KeyError: 'email'
>>> for user in my_users:
...     if 'email' in user:
...         print(user['email'])
... 
abc@abc.abc

>>> selected_user = {}
>>> my_user_lookup = 2
>>> for user in my_users:
...     if 'id' in user:
...        if user['id'] == my_user_lookup:
...           selected_user = user
... 
>>> print(selected_user)
{'username': 'abc', 'id': 2, 'email': 'abc@abc.abc'}
>>> for x in range(0, 10):
...    print(x)
... 
0
1
2
3
4
5
6
7
8
9
>>> for x in range(0, 10):
...    for user in my_users:
...        if user['id'] == x:
...           print(user)
... 
{'username': 'jmitchel3', 'id': 1}
{'username': 'abc', 'id': 2, 'email': 'abc@abc.abc'}
```