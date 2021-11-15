import os

this_file_path = os.path.abspath(__file__)
print(this_file_path)
BASE_DIR = os.path.dirname(this_file_path)
print(BASE_DIR)
ENTIRE_PROJECT_DIR = os.path.dirname(BASE_DIR)
print(ENTIRE_PROJECT_DIR)

email_txt = os.path.join(BASE_DIR, "templates", "email.txt")
print(email_txt)

# content = ''

with open(email_txt, 'r') as f:
    content = f.read()
print(content.format(name="Dhrey"))
