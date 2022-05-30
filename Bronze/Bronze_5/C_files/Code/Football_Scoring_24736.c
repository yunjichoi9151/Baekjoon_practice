#include <stdio.h>

int main()
{
    int numArr1[5], numArr2[5], sum1 = 0, sum2 = 0;

    for (int i = 0; i < 5; i++) {
        scanf("%d", &numArr1[i]);
    }
    sum1 = numArr1[0] * 6 + numArr1[1] * 3 + numArr1[2] * 2 + numArr1[3] + numArr1[4] * 2;

    for (int i = 0; i < 5; i++) {
        scanf("%d", &numArr2[i]);
    }
    sum2 = numArr2[0] * 6 + numArr2[1] * 3 + numArr2[2] * 2 + numArr2[3] + numArr2[4] * 2;

    printf("%d %d", sum1, sum2);

    return 0;
}