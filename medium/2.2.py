def search(ls, find):
    l = 0
    h = len(ls) - 1
    last_find = -1
    while h - 1> l:
        if ls[l + int((h - l) /2)] >= find:
            if (ls[l + int((h - l) /2)] == find):
                last_find = l + int((h - l) /2)
            h = h - int((h - l )/2) - 1
        else:
            l = l + int((h - l) /2)
    if (ls[h] == find):
        last_find = h
    if (ls[l] == find):
        last_find = l
    return last_find

a = int(input())
ls = list(map(int, input().split()))
w = int (input())
for i in range (w):
    e = int(input())
    print(search(ls, e))







