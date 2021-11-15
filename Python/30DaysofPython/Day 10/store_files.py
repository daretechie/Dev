import os

BASE_DIR = os.path.dirname(os.path.abspath(__file__))
files_dir = os.path.join(BASE_DIR, "images")
# print(files_dir)

os.makedirs(files_dir, exist_ok=True)

my_images = range(0, 20)

for item in my_images:
    fname = f"{item}.txt"
    file_path = os.path.join(files_dir, fname)
    if os.path.exists(file_path):
        print(f"Skipped {fname}, already exist")
        continue
    with open(file_path, "w") as f:
        f.write(f"Hello, text file {fname}")

