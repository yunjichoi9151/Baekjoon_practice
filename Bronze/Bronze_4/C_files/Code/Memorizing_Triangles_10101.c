#include <stdio.h>

int main()
{
    int a, b, c;

    scanf("%d\n%d\n%d", &a, &b, &c);

    if (a + b + c == 180) {
        if (a == b && b == c && c == a)
            printf("Equilateral");
        else if (a == b || b == c || c == a)
            printf("Isosceles");
        else
            printf("Scalene");
    }
    else
        printf("Error");
    
    return 0;
}