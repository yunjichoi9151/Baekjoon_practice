#include <stdio.h>

int main()
{
    int x, n, a, b, i, sum = 0;

    scanf("%d\n%d", &x, &n);

    for (i = 0; i < n; i++) {
        scanf("%d %d", &a, &b);
        sum += a * b;
    }

    printf("%s", (sum == x) ? "Yes" : "No");

    return 0;
}