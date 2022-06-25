#include <stdio.h>

int main()
{
    long long n, m;

    scanf("%lld %lld", &n, &m);

    printf("%s", (n == m) ? "1" : "0");

    return 0;
}