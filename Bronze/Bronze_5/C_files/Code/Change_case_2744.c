#include <stdio.h>

int main()
{
    char str[101];

    scanf("%s", &str);

    for (int i = 0; str[i]; i++) {
		if (str[i] >= 65 && str[i] <= 90)
			str[i] += 32;
		else if (str[i] >= 97 && str[i] <= 122)
			str[i] -= 32;
	}
    printf("%s\n", str);

    return 0;
}