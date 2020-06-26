n = int(input())
temp = 0
for i in range(n):
  s = '*'*(i*2)
  j = 0
  while(j < n-i):
    temp+=1
    s+= str(temp) + '0'
    j+=1
  cont = ((n-(i+1))*(n-i)) + temp
  j = 0
  while(j < n-i):
    cont+=1
    s+= str(cont) + '0'
    j+=1
  
  print(s[:len(s)-1])
    
    
    
    