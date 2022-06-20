p1, q1, p2, q2 = map(int, input().split())
a = p1 * p2 / q1 / q2 / 2
if int(a) == a:
    print(1)
else:
    print(0)