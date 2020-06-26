t = int(input())
for i in range(t):
  n = int(input())
  s = 0
  j = 0
  while(n>s):
    s+= 2**j
    j+=1
  print(j)