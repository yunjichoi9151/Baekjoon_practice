#include <stdio.h>

int main()
{
    long long n, m;

    scanf("%lld %lld", &n, &m);

    printf("%lld", llabs(n - m));

    return 0;
}