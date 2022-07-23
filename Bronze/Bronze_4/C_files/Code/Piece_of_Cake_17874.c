#include <stdio.h>

int main()
{
    double n, h, v;

    scanf("%lf %lf %lf", &n, &h, &v);

    if (n / 2 > h)
        h = n - h;
    if (n / 2 > v)
        v = n - v;
    
    printf("%d\n", (int)(4 * (h * v)));

    return 0;
}