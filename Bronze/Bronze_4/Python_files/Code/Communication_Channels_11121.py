n = int(input())
for i in range(n):
    a, b = input().split()
    print("OK" if a[1:] == b[1:] else "ERROR")