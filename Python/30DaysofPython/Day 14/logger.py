import os
import datetime

BASE_DIR = os.path.dirname(__file__)
log_dir = os.path.join(BASE_DIR, 'logs')
os.makedirs(log_dir, exist_ok=True)


def trigger_log_save():
    filename = f"{datetime.datetime.now()}.txt"
    file_path = os.path.join(log_dir, filename)
    with open(file_path, 'wf') as f:
        f.write("")
