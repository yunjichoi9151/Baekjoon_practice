#include <stdio.h>

int main()
{
    int t1, m1, t2, m2, diff;

    scanf("%d %d %d %d", &t1, &m1, &t2, &m2);

    m1 += t1 * 60;
    m2 += t2 * 60;

    if (m1 > m2)
        m2 += 24 * 60;
    
    diff = m2 - m1;

    printf("%d %d", diff, diff / 30);

    return 0;
}