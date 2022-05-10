#include <stdio.h>

int main()
{
    int a, b, x, y, z;

    scanf("%d\n%d", &a, &b);

    x = b / 100;
    z = b % 10;
    y = (b - (x * 100 + z)) / 10;

    printf("%d\n", a * z);
    printf("%d\n", a * y);
    printf("%d\n", a * x);
    printf("%d", a * b);

    return 0;
}