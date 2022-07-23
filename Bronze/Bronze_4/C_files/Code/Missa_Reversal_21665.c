#include <stdio.h>

int main()
{
    int n, m, sum = 0;
    char arr1[101][101], arr2[101][101], tmp;
    
    scanf("%d %d\n", &n, &m);
    
    for (int i = 0; i < n; i++) {
        scanf("%s", &arr1[i]);
    }

    for (int i = 0; i < n; i++) {
        scanf("%s", &arr2[i]);
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if ((arr1[i][j] == 'B' && arr2[i][j] == 'W') || (arr1[i][j] == 'W' && arr2[i][j] == 'B'))
                continue;
            else
                sum++;
        }
    }

    printf("%d", sum);

    return 0;
}