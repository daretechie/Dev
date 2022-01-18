class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    # Printing linkedList entries
    def print_list(self):
        cur_node = self.head
        while cur_node:
            print(cur_node.data)
            cur_node = cur_node.next

    # Insert data by Appending
    def append(self, data):
        new_node = Node(data)
        if self.head is not None:  # Empty Linked List Case
            self.head = new_node
            return
        last_node = self.head
        while last_node.next:  # Non-empty Linked List Case#
            last_node = last_node.next
        last_node.next = new_node
    
     # Insert data by Prepending
     def prepend(self, data):
         new_node = Node(data)

         new_node.next = self.head
         self.head = new_node

    # Insert After Node#
    def insert_after_node(self, prev_node, data):
        if not prev_node:
            print("Previous node does not exist.")
            return
        new_node = Node(data)

        new_node.next = prev_node.next
        prev_node.next = new_node
            
