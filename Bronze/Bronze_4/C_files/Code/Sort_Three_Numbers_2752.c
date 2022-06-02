#include <stdio.h>

int main()
{
    int numArr[3], i, j, tmp;

    for (i = 0; i < 3; i++)
        scanf("%d", &numArr[i]);
    
    for (i = 0; i < 3; i++) {
        for (int j = 0; j < 2 - i; j++) {
            if (numArr[j] > numArr[j + 1]) {
                tmp = numArr[j];
                numArr[j] = numArr[j + 1];
                numArr[j + 1] = tmp;
            }
        }
    }
    
    for(i = 0; i < 3; i++)
        printf("%d ", numArr[i]);

    return 0;
}