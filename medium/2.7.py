
def merge(ans, ls):
    l = len(ls)
    currentL = 0
    newL = 0
    temp = list()
    while (currentL < len(ans) or newL < l):
        if (currentL >= len(ans)):
            temp.append(ls[newL])
            newL +=1
        elif (newL >= l):
            temp.append(ans[currentL])
            currentL +=1
        elif(ans[currentL] <= ls[newL]):
            temp.append(ans[currentL])
            currentL +=1
        else:
            temp.append(ls[newL])
            newL +=1
    return (temp)


a = int(input())
ans = list()
for i in range(a):
    l = int(input())
    if (l == 0): pass
    ls = list(map(int,input().split()))
    ans.append(ls)
ans = [x for x in ans if len (x) >= 1]
if len(ans) <= 1:
    print(*ans)
else:
    while (len(ans) > 1):
        temp = list()
        for i in range(len(ans)//2):
            temp.append(merge(ans[i], ans[i+1]))
        if (len(ans)%2 == 1):
            temp.append(ans[len(ans) - 1])
        ans = temp

    print(*ans[0])
