#include <stdio.h>

int main()
{
    int fish[4], i, inc = 0, dec = 0, same = 0;

    for (i = 0; i < 4; i++)
        scanf("%d", &fish[i]);
    
    for (i = 0; i < 3; i++) {
		if (fish[i] < fish[i + 1])
			inc += 1;
		else if (fish[i] > fish[i + 1])
			dec += 1;
		else if (fish[i] == fish[i + 1])
			same += 1;
	}

    if (inc == 3)
		printf("Fish Rising");
	else if (dec == 3)
		printf("Fish Diving");
	else if (same == 3)
		printf("Fish At Constant Depth");
	else if (inc != 3 || dec != 3 || same != 3)
		printf("No Fish");

    return 0;
}