w_c, h_c, w_s, h_s = map(int, input().split())
print(1 if (w_c - 2 >= w_s) and (h_c - 2 >= h_s) else 0)