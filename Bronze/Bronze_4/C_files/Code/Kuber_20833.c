#include <stdio.h>
#include <math.h>

int main()
{
    int n, i, sum = 0;

    scanf("%d", &n);

    for (i = 1; i <= n; i++)
        sum += round(pow(i, 3));

    printf("%d", sum);

    return 0;
}