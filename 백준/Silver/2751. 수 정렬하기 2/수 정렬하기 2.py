n = int(input())
myList = []
for i in range(n):
    myList.append(int(input()))
myList.sort()
for i in range(n):
    print(myList[i])