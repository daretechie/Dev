stuff = {'rope': 1, 'torch': 6, 'gold coin': 42, 'dagger': 1, 'arrow': 12, 'gun': 1, 'bullet': 30}


def displayInventory(inventory):
    print('Inventory')
    item_total = 0
    for k, v in inventory.items():
        print(str(v) + ' ' + k)
        item_total += v
    print("Total number of items: " + str(item_total))


def add_to_inventory(inventory, added_items):
    count = {}
    for i in added_items:
        count.setdefault(i, 0)
        count[i] = count[i] + 1
    for k, v in inventory.items():
        for k, v in count.items():
            if k == k:
                v = v + v


            # if inventory.get(k) == count.get(k):
            #     count = count.values() + inventory.values()
    return count
    # a = {}
    # for k, v in inventory.items():
    #     for k, v in added_items.items():
    #         if inventory[k] == added_items[k]:
    #             a = v.get(k, 0) + v.get(k, 0)
    # return a


inv = {'gold coin': 42, 'rope': 1}
dragonLoot = ['gold coin', 'dagger', 'gold coin', 'gold coin', 'ruby']
inv = add_to_inventory(inv, dragonLoot)
displayInventory(inv)