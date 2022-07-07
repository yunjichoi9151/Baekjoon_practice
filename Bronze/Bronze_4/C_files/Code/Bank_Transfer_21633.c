#include <stdio.h>

int main()
{
    long long k;
    double tmp;

    scanf("%lld", &k);

    tmp = 25 + k * 0.01;
    
    if (tmp < 100)
        printf("%.2lf", 100.0);
    else if (tmp > 2000)
        printf("%.2lf", 2000.0);
    else
        printf("%.2lf", tmp);

    return 0;
}