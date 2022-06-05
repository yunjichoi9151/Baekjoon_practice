while 1:
    s = input()
    x = 0
    if s[0] == '#' and len(s) == 1:
        break
    else:
        for i in 'aeiouAEIOU':
            x += s.count(i)
        print(x)