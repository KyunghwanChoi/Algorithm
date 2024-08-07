myList = list(map(int, input().split()))
a = myList[0]
b = myList[1]
aFactors = []
bFactors = []
commonFactors = []

for i in range(1, a + 1):
    if a % i == 0:
        aFactors.append(i)
for i in range(1, b + 1):
    if b % i == 0:
        bFactors.append(i)

for i in aFactors:
    for j in bFactors:
        if i == j:
            commonFactors.append(i)

GCD = commonFactors[-1]
LCM = int(a * b / GCD)
print(GCD)
print(LCM)