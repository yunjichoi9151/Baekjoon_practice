#include <stdio.h>

int main()
{
    char c;

    scanf("%c", &c);

    printf("%s", (c == 'N' || c == 'n') ? "Naver D2" : "Naver Whale");

    return 0;
}