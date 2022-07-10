#include <stdio.h>

int main()
{
    double a, b, c;

    scanf("%lf %lf %lf", &a, &b, &c);

    printf("%.6lf", (a * 2 * 0.229 * 0.324) + (b * 2 * 0.297 * 0.42) + (c * 0.21 * 0.297));

    return 0;
}