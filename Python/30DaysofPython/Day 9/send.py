import sys

from formatting import format_msg
from send_mail import send_mail


def send(name_, website=None, to_email=None, verbose=False):
    assert to_email is not None
    if website is not None:
        msg = format_msg(my_name=name_, my_website=website)
    else:
        msg = format_msg(my_name=name_)

    if verbose:
        print(name_, website, to_email)

    # send the message
    try:
        send_mail(text=msg, to_emails=[to_email], html=None)
        sent = True
    except:
        sent = False

    return sent


if __name__ == '__main__':
    print(sys.argv)
    name = "Unknown"
    if len(sys.argv) > 1:
        name = sys.argv[1]
    email = None
    if len(sys.argv) > 2:
        email = sys.argv[2]
    response = send(name, to_email=email, verbose=True)
    print(response)
