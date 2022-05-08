num = int(input())
count = 0
tmp = num

while True:
    a = tmp // 10
    b = tmp % 10
    new_num = b * 10 + (a + b) % 10
    count += 1
    if num == new_num:
        break;
    else:
        tmp = new_num;
print(count)