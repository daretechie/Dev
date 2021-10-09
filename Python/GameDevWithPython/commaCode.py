def listValue():
    listParas = []
    while True:
        listPara = input('>> ')
        listParas.append(listPara)
        if listPara == '':
            break
        print(listParas)



l = listValue()
print(l)

