#include <stdio.h>

int main()
{
	int numArr[42] = { 0, }, i, a, tmp, count = 0;
    for(i = 0; i < 10; i++){
        scanf("%d", &a);
        tmp = a % 42;
        numArr[tmp]++;
    }

    for(i = 0; i < 42; i++){
        if(numArr[i] != 0)
            count++;
    }
    printf("%d", count);
    return 0;
}