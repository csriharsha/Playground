minl = int(input())
maxl = int(input())
minw = int(input())
maxw = int(input())
count = 0
for i in range(minl, maxl+1):
  for j in range(minw, maxw+1):
    c = [i, j] if i>j else [j, i]
    k = [c[1], c[1]]
    while(c[0] != c[1]):
      if(c[0] == 1 or c[1] == 1):
        count+=(abs(c[0]-c[1]))
        break
      #print(c, end=' ')
      #print(k, end=' ')
      c[1] = c[0] - k[0]
      c[0] = k[0]
      if(c[1]>c[0]):
        c[0], c[1] = c[1], c[0]
      k = [c[1], c[1]]
      #print(c)
      count+=1
    count+=1
print(count)
                 




