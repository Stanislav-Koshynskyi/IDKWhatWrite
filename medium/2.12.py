import itertools
num, suma = map(int, input().split())
ls = list(map(int,input().split()))
s = [p for r in range(1, len(ls) + 1) for p in itertools.combinations(ls, r)]
w = [x for x in s if sum(x) == suma]
print(len(w))
if (len(w) <= 15):
    for i in w:
        formatted_str = " ".join(map(str, i))
        print("{ " + formatted_str + " }")