#include <stdio.h>

int main()
{
    int n, sum = 0;

    while (n != -1) {
        scanf("%d", &n);
        sum += n;
    }

    printf("%d", sum + 1);

    return 0;
}