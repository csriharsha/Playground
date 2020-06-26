S, R = list(map(int, input().strip().split()))
arr = list(map(int, input().strip().split()))
l = []
for i in range(R):
  minr, maxr = list(map(int, input().strip().split()))
  l.append([minr, maxr])

for i in range(len(l)):
  count = 0
  for j in range(S):
    if(arr[j]>=l[i][0] and arr[j]<=l[i][1]):
      count+=1
  print(count, end=' ')
