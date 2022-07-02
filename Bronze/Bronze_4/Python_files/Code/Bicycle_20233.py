a = int(input())
x = int(input())
b = int(input())
y = int(input())
t = int(input())
if t <= 30:
    print(a, b)
elif t > 30 and t <= 45:
    print(a + 21 * x * (t - 30), b)
elif t > 45:
    print(a + 21 * x * (t - 30), b + 21 * y * (t - 45))