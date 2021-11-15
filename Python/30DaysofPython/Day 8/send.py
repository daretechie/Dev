import sys
import requests

from formatting import format_msg


def send(name_, website=None, verbose=False):
    if website is not None:
        format_msg(my_name=name_, my_website=website)
    else:
        format_msg(my_name=name_)
    if verbose:
        print(name_, website)
    # send the message
    r = requests.get("http://httpbin.org/json")
    if r.status_code == 200:
        return r.json()
    else:
        return "There was an error"


if __name__ == "__main__":
    print(sys.argv)
    name = "Unknown"
    if len(sys.argv) > 1:
        name = sys.argv[1]
    response = send(name, verbose=True)
    print(response)
