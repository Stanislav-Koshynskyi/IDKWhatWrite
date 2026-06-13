d = dict()
a = int(input())
for i in range (a):
    name, price = map(str, input().split())
    price = int(price)
    if (name in d.keys()):
        arr = d.get(name)
        arr[0] += 1
        arr[1] += price
    else:
        arr = [1, price]
        d[name] = arr
qwe = list(d)
qwe = sorted(qwe)
for i in qwe:
    print(i, *d.get(i))