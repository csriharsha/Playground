n, k = list(map(int, input().strip().split()))
A = list(map(int, input().strip().split()))
B = list(map(int, input().strip().split()))
s = 0
for i in range(n):
  s+=A[i]*B[i]
  
max_diff = -1
for i in range(n):
  if(A[i]*B[i] > 0 and A[i] > 0):
    temp = (A[i]-2*k)*B[i]
  elif(A[i]*B[i] > 0 and A[i] < 0):
    temp = (A[i]+2*k)*B[i]
  elif(A[i]*B[i] < 0 and A[i] > 0):
    temp = (A[i]+2*k)*B[i]
  else:
    temp = (A[i]-2*k)*B[i]
    
  diff = A[i]*B[i] - temp
  max_diff = diff if diff > max_diff else max_diff
print(s-max_diff)
    
    