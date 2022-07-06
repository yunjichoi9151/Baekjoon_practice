#include <stdio.h>

int main()
{
    int b, p;

    scanf("%d", &b);

    p = 5 * b - 400;

    printf("%d\n", p);

    if (p > 100)
        printf("-1");
    else if (p == 100)
        printf("0");
    else if (p < 100)
        printf("1");

    return 0;
}