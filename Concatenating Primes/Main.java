def prime(num):
  if(num==2 or num==3):
    return True
  if(num==4):
    return False
  for i in range(2, num//2):
    if(num%i == 0):
      return False
  return True

n = int(input())
l = []
for i in range(2, n+1):
  if(prime(i)):
    l.append(str(i))
    
count = 0
for i in range(len(l)):
  for j in range(len(l)):
    num = int(l[i]+l[j]) 
    if(prime(num)):
      count+=1
      
print(count)

    
    
    
    
    