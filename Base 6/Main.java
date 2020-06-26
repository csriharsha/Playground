def convert_derived(arr1):
  arr = []
  for num in(arr1):
    sumn = 0
    while(num!=0):
      rem = num%6
      num = (num-rem)/6
      sumn+=rem
    arr.append(int(sumn))
  return arr

def no_inversions(arr):
  count = 0
  arr1 = arr.copy()
  while(True):
    cnt = 0
    for i in range(len(arr1)-1):
      if(arr1[i] > arr1[i+1]):
        temp = arr1[i+1]
        arr1[i+1] = arr1[i]
        arr1[i] = temp
        cnt+=1
        count+=1
        break
    if(cnt==0):
      break
  return count
    

n = int(input())
origarr = list(map(int, input().strip().split()))
arr = convert_derived(origarr)
result = no_inversions(arr)
print(result)




