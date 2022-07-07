#include <stdio.h>

int main()
{
    int arr[3], max = 0, i;

    scanf("%d %d %d", &arr[0], &arr[1], &arr[2]);

    for (i = 0; i < 3; i++) {
        if (max < arr[i])
            max = arr[i];
    }

    printf("%d", max * 3 - (arr[0] + arr[1] + arr[2]));

    return 0;
}