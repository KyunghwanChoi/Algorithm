n = int(input())
myList = list(map(int, input().split()))
newList = []
M = max(myList)
for i in range(n):
    newList.append(myList[i] / M * 100)
print(sum(newList) / n)