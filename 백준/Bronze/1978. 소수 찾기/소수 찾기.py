n = int(input())
myList = list(map(int, input().split()))
total = 0


for i in range(n):
    count = 0
    for j in range(1, myList[i] + 1):
        if myList[i] % j == 0:
            count += 1
    if count == 2:
        total += 1
print(total)