import os
import shutil

import requests

from download_util import download_file

THIS_FILE_PATH = os.path.abspath(__file__)
BASE_DIR = os.path.dirname(THIS_FILE_PATH)
DOWNLOAD_DIR = os.path.join(BASE_DIR, "downloads")
os.makedirs(DOWNLOAD_DIR, exist_ok=True)

downloaded_img_path = os.path.join(DOWNLOAD_DIR, "image1.jpg")
url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/db/Classic_view_of_a_cloudfree_Peyto_Lake" \
      "%2C_Banff_National_Park%2C_Alberta%2C_Canada_%284110933448%29.jpg/330px-Classic_view_of_a_cloudfree_Peyto_Lake" \
      "%2C_Banff_National_Park%2C_Alberta%2C_Canada_%284110933448%29.jpg "

# a smallish item
r = requests.get(url, stream=True)
r.raise_for_status()  # 200 status
with open(downloaded_img_path, 'wb') as f:
    f.write(r.content)

download_filename = os.path.basename(url)  # for the image to be saved using the name from the url
new_download_path = os.path.join(DOWNLOAD_DIR, download_filename)
with requests.get(url, stream=True) as r:
    with open(new_download_path) as file_obj:
        shutil.copyfileobj(r.raw, file_obj)

download_file(url, DOWNLOAD_DIR)
