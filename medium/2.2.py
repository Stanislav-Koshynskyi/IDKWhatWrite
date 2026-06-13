def search(ls, find):
    l = len(ls)
    if l <=3:
        for i in range(i):
            if ls[i] == find:
                return(i)
        return(-1)        
    now = round(l / 2) - 1
    previous = 0
    last_find = -1
    
    while (now != previous):
        if (ls[now] >= find):
            if ls[now] == find:
                last_find = now
            temp = now
            now =now - round((abs(now - previous) / 2))
            previous = temp
        else:
            temp = now
            now =now + round((abs(now - previous) / 2))
            previous = temp
    return last_find


a = int(input())
ls = list(map(int, input().split()))
w = int (input())
for i in range (w):
    e = int(input())
    print(search(ls, e))







