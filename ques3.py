def ceb(M, n):
	list = [[] for i in range(n)]
	for i in range(n):
		for j in range(n):
			if M[i][j] == 1:
				list[i].append(j)

	print(list)

	for i in range(n):
		if not list[i]:
			f = True
			for j in range(n):
				if i == j:
					continue
				if i not in list[j]:
					f = False
					break
			if f:
				return i
	return -1

M = [[0,1,0],[0,0,0],[0,1,0]]
n = len(M)
ans = ceb(M, n)
if ans != -1:
	print("Celebrity is : ", ans)
