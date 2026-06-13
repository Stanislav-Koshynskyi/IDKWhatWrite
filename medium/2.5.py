a = int(input())
ls = list(map(int,input().split()))

max_sum = 0
current_sum = 0
max_start = 0
max_end = 0
current_start = 0
for i in range(len(ls)):
    if (ls[i] > current_sum + ls[i]):
        current_sum = ls[i]
        current_start = i
    else:
        current_sum += ls[i]
    if (current_sum > max_sum):
        max_sum = current_sum
        max_start = current_start
        max_end = i
print(max_sum, max_start, max_end)