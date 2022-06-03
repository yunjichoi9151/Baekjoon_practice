#include <stdio.h>

int main()
{
    int s1, s2;

    scanf("%d\n%d", &s1, &s2);

    if (s2 - s1 < 1)
        printf("Congratulations, you are within the speed limit!");
    else if (s2 - s1 >= 1 && s2 - s1 <= 20)
        printf("You are speeding and your fine is $100.");
    else if (s2 - s1 >= 21 && s2 - s1 <= 30)
        printf("You are speeding and your fine is $270.");
    else if (s2 - s1 >= 31)
        printf("You are speeding and your fine is $500.");

    return 0;
}