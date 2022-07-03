x, y, z = map(int, input().split())
xi, yi, zi = map(int, input().split())
if xi >= x and yi >= y and zi >= z:
	print("A")
elif xi >= x / 2 and yi >= y and zi >= z:
	print("B")
elif yi >= y and zi >= z:
	print("C")
elif yi >= y / 2 and zi >= z:
	print("D")
else:
	print("E")