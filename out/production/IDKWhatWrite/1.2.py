a = int(input())
ls = list(map(int, input().split()))
good = True
lower = True
for i in range (a - 1):
    if lower:
        if (ls[i] >= ls[i+1]):
            good = False
    else:
        if (ls[i] <= ls[i+1]):
            good = False
    lower = not lower
if good:
    print("YES")
else:
    print("NO")