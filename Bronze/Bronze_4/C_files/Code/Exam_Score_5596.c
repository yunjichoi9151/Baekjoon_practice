#include <stdio.h>

int main()
{
    int s, i, sum_1 = 0, sum_2 = 0;

    for (i = 0; i < 4; i++) {
        scanf("%d", &s);
        sum_1 += s;
    }
    for (i = 0; i < 4; i++) {
        scanf("%d", &s);
        sum_2 += s;
    }

    printf("%d", (sum_1 >= sum_2) ? sum_1 : sum_2);

    return 0;
}