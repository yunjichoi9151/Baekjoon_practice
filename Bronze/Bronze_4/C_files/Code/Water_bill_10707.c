#include <stdio.h>

int main()
{
    int a, b, c, d, p, x, y;

    scanf("%d\n%d\n%d\n%d\n%d", &a, &b, &c, &d, &p);

    x = a * p;
    if (p > c)
        y = b + (p - c) * d;
    else
        y = b;
    
    printf("%d", (x < y) ? x : y);

    return 0;
}