#include <stdio.h>

int main()
{
    int n, i, ans = 1;

    scanf("%d", &n);

    for (i = 1; i < n + 1; i++)
        ans *= i;
    
    printf("%d", ans % 10);

    return 0;
}