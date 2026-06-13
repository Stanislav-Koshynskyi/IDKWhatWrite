count, min = map(int, input().split())
ls = list(map (int, input().split()))
bal = sum(ls)/ count
print(bal)
if (bal >= min):
    print("PASS")
else:
    print("FAIL")