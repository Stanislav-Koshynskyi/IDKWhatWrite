a = int(input())
w = list()
for i in range(a):
    w.append(str(input()))
w = list(set(w))
print (len(w))
print ("OK" if len(w)<=1000 else "ALERT")
