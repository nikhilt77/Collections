from getpass import getpass

def checkPassword(password):
    if len(password) <= 8:
        return False

    has_upper = any(char.isupper() for char in password)

    has_lower = any(char.islower() for char in password)

    has_digit = any(char.isdigit() for char in password)

    special_characters = "!@#$%^&*()-+"
    has_special = any(char in special_characters for char in password)

    return has_upper and has_lower and has_digit and has_special

password = getpass("Enter Password: ")

if checkPassword(password):
    print("Strong")
else:
    print("Not Strong")
