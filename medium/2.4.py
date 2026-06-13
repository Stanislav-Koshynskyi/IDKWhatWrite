a = int(input())
modul = 7 + (10**9)
for i in range(a):
    w = int(input())
    first = 1
    second = 0
    for i in range(w):
        temp = first
        first = (first + second)
        second = temp
    print (second % modul)
