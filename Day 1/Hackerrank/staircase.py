#https://www.hackerrank.com/challenges/staircase/problem
n = int(input())
for i in range(1,n+1):
	print(" "*int(n-i) + "#"*int(i))