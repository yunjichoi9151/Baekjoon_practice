a, p = map(int, input().split())
if a * 7 == p * 13:
    print("lika")
else:
    print("Axel" if a * 7 > p * 13 else "Petra")