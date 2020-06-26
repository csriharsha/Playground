t = int(input())
for i in range(t):
  s = input()
  d = {}
  for j in range(len(s)):
    if(s[j] not in d):
      d[s[j]] = 1
    else:
      d[s[j]]+= 1
      
  flag = True
  for key in (d):
    if(d[key] != (ord(key) - 96)):
      flag = False
      break
  print('YES', end=' ') if flag else print('NO', end=' ')
  
  