#include <stdio.h>

int main()
{
    int m, n, i, j, numArr[21][21];

    scanf("%d %d", &m, &n);

    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++)
            scanf("%d", &numArr[i][j]);
    }

    printf("%s", (m >= 8) ? "satisfactory" : "unsatisfactory");

    return 0;
}