n = int(input())
sum = 0
numArr = list(map(int, input().split()))
m = max(numArr)
for i in numArr:
    sum += i / m * 100;
print(sum / n)