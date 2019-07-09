#https://www.hackerrank.com/challenges/mini-max-sum/problem
a = [int(x) for x in input().split()]
a.sort()
print("{1} {0}".format(sum(a[1:]),sum(a[0:4])))