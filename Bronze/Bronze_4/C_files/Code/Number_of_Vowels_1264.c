#include <stdio.h>
#include <string.h>

int main()
{
    char s[256];
	while (1) {
		gets(s);
        int count = 0;
		if (s[0] == '#')
			break;
		for (int i = 0;  i < strlen(s) - 1; i++) {
			if (s[i] == 'a' || s[i] == 'A' || s[i] == 'e' || s[i] == 'E' || s[i] == 'i' || s[i] == 'I' || s[i] == 'o' || s[i] == 'O' || s[i] == 'u' || s[i] == 'U')
				count++;
        }
		printf("%d\n", count);
	}
	return 0;
}