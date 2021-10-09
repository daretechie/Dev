def spam():

    eggs = 'spam local'
    print(eggs)  # ERROR! u

spam()
eggs = 'global'
spam()
