#include <stdio.h>

int main()
{
    double a;

    scanf("%lf", &a);

    printf("%.10f\n%.10f", 100 / a, 100 / (100 - a));

    return 0;
}