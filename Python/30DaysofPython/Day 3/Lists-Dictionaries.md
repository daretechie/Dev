Day 3 - Lists & Dictionaiers

## Lists 
_This is used to hold much information or value_

__Declare__
```
my_list = []
```
or
```
my_list = [1, 2, 3, 4, 5]
```


### Lists
```python
>>> my_cart = [12.99, 312, 32, 142]
>>> sum(my_cart)
498.99

# Add to a list
>>> my_cart.append(39.99)
>>> print(my_cart)
[12.99, 312, 32, 142, 39.99]

# Find len of a list
>>> len(my_cart)
5
>>> my_cart
[12.99, 312, 32, 142, 39.99]

# Access a value from a list
>>> my_cart[3]
142
>>> my_cart[2]
32
>>> my_cart[2] * 120
3840
>>> my_cart
[12.99, 312, 32, 142, 39.99]

>>> my_items = ["mouse", "laptop", "mic", "screen", "snack"]
>>> my_items
['mouse', 'laptop', 'mic', 'screen', 'snack']
>>> my_cart[1]
312
>>> my_items[1]
'laptop'

# Join two lists
>>> my_products = [my_items, my_cart]
>>> my_products
[['mouse', 'laptop', 'mic', 'screen', 'snack'], [12.99, 312, 32, 142, 39.99]]
>>> 
```

## Dictionaries
_This is used to hold key/value pairs information. Think of the contact on your phone- contact Name and Number_

__Declare__
```
my_dict = {}
```
or
```
my_dict = {"name": "Dhrey Ghaniyy", "age": 2000}
key = name and value = Dhrey Ghaniyy
```
### Dictionaries
```python
>>> my_data = {"name": "Justin Mitchel"}

# Accessing a value in a dictionary
>>> my_data["name"]
'Justin Mitchel'
>>> my_data = {"name": "Justin Mitchel", "location": "California"}

# this is not allowed in dictionary unlike in list
>>> my_data[0]
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
KeyError: 0

# key() function can also be used
>>> my_data.keys()
dict_keys(['name', 'location'])
>>> list(my_data.keys())
['name', 'location']
>>> list(my_data.keys())[0]
'name'

# Unlike in list append can be used in dict
>>> my_data.append({"occ": "coder"})
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
AttributeError: 'dict' object has no attribute 'append'

# Add new info to a dictionary
>>> my_data["occ"] = "Coder"
>>> my_data
{'name': 'Justin Mitchel', 'location': 'California', 'occ': 'Coder'}

# Join two dicts
>>> user_1 = {"name": "James bond"}
>>> user_2 = {"name": "Ned Stark"}
>>> my_users = [user_1, user_2]
>>> my_users
[{'name': 'James bond'}, {'name': 'Ned Stark'}]
```