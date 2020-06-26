t = int(input())
for i in range(t):
  N, T = list(map(int, input().strip().split()))
  E = list(map(int, input().strip().split()))
  P, D = list(map(int, input().strip().split()))
  if(N > T):
    print('NO', end='')
    continue
  
  flag = True
  while(sum(E) != -N):
    flag = False
    for k in range(N):
      if(E[k] <= P and E[k]!= -1):
        P+=(P-E[k])
        E[k] = -1
        flag = True
    if(flag == False):
      print('NO', end='')
      break
      
  if(flag==True):
    print('YES', end='')
        
        
        
        
        