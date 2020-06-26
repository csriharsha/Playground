n = int(input())
l = []
l.append(int((n-4)/5))
l.append(2 if((n-l[0]*5)%2 == 0) else 1)
l.append(int((n - l[0]*5 - l[1])/2))
print(int(sum(l)), end = ' ')
print(int(l[0]), end = ' ')
print(int(l[2]), end = ' ')
print(int(l[1]))