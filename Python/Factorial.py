# Python program that returns factorial of given number
 
def fac(x):
    if x==0:
        return 1
    elif x>0:
        return x*fac(x-1)

