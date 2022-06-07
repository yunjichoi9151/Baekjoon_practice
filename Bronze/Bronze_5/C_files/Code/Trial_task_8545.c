#include <stdio.h>

int main()
{
    char s[5], tmp;

    scanf("%s", &s);

    for (int i = 0; i < 1.5; i++) {
        tmp = s[i];
        s[i] = s[2 - i];
        s[2 - i] = tmp;
    }
    printf("%s", s);

    return 0;
}