a = int(input())
w = list()
for i in range(a):
    name, day = map(str ,input().split())
    day = int(day)
    w.append([name, day])
w.sort(key=lambda x: (x[1], x[0]))
for i in w:
    print(i[1], i[0])