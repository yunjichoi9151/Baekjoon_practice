m, s, g = map(int, input().split())
a, b = map(float, input().split())
l, r = map(int, input().split())
print("latmask" if m / g + l / a > m / s + r / b else "friskus")