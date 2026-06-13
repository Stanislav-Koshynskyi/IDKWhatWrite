d = dict()
a = int(input())
for i in range(a):
    s = str(input())
    if (s not in d.keys()):
        d[s] = 1
    else:
        d[s] = d.get(s) + 1
q = list(d)
w = list()
for i in q:
    w.append([i, d.get(i)])
w.sort(key= lambda x: (-x[1], x[0]))
print (w[0][0])