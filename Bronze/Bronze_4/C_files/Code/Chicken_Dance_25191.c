#include <stdio.h>

int main()
{
    int n, a, b;

    scanf("%d\n%d %d", &n, &a, &b);

    printf("%d", (n >= a / 2 + b) ? a / 2 + b : n);

    return 0;
}