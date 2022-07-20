#include <stdio.h>
#include <string.h>

int main()
{
    int t;
    char a[121], b[1121];

    scanf("%d", &t);

    for (int i = 0; i < t; i++) {
		scanf("%s %s", a, b);
		if (strcmp(a, b) == 0)
			printf("OK\n");
		else
			printf("ERROR\n");
    }

    return 0;
}