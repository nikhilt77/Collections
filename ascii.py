s=input("Enter String:")
key=input("Enter key:")
def convert(s,d):
  s1=""
  for c in s:
    i=ord(c)+(d%26)
    if(i>90):
      i=i-26
      s1=s1+chr(i)
    else:
      s1=s1+chr(i)
  return s1
print(convert(s,key))
