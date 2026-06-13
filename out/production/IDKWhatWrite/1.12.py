a = int (input())
for i in range(a):
    fr, to, e = map(str, input().split())
    num = int(e, int(fr))
    if to == "2":
        print(bin(num)[2:])
    elif to == "8":
        print(oct(num)[2:])
    elif to =="16":
        print(hex(num)[2:])
    else:
        print(num)
