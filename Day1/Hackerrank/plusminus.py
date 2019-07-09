#https://www.hackerrank.com/challenges/plus-minus/problem
n = int(input())
p = 0
ne = 0
z = 0
a = [int(x) for x in input().split()]
for i in a:
    if i > 0:
        p+=1
    elif i < 0:
        ne+=1
    else:
        z+=1
print("{0}\n{1}\n{2}".format(p/n,ne/n,z/n))