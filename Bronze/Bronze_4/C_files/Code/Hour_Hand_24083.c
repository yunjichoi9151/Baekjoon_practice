#include <stdio.h>

int main()
{
    int a, b;

    scanf("%d\n%d", &a, &b);

    printf("%d", (a + b) % 12 == 0 ? 12 : (a + b) % 12);

    return 0;
}