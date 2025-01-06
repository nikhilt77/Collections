def func(n):
    if n <= 1:
        return n
    else:
        return func(n-1) + func(n-2)

n = int(input("Enter the number of terms: "))
print(func(n))
