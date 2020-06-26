def palindrome(l):
  for i in range(int(len(l)/2)):
    if(l[i] != l[len(l)-1-i]):
      return False
  return True

t = int(input())
for i in range(t):
  l = list(input().strip())
  lrot, rrot = l[:], l[:]
  lcount, rcount = 0, 0
  for j in range(len(l)):
    if(palindrome(lrot)):
      break
    elif(palindrome(rrot)):
      break
    else:
      temp = lrot.pop(0)
      lrot.append(temp)
      temp = rrot.pop(len(l)-1)
      rrot = [temp]+rrot
      lcount+=1
      rcount+=1
  if(rcount == len(l)):
    print(-1)
  elif(rcount>lcount):
    print(lcount)
  else:
    print(rcount)
      
         
