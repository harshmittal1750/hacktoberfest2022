# Python program to check if a number is palindrome or not

def ispal(x):
    if x>0:
        return str(x)==str(x)[::-1]   #Converting the integer to string and checking if it is equal when the string is reversed.
    elif x<=0:
        x=x*(-1)                      #Here to remove the negative sign we multiply the number my -1 before converting to string because if the negative sign is present then after reversing the string the sign will shift to the back of the number and sometimes result in false ansers.
        return str(x)==str(x)[::-1]



