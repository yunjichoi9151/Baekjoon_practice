import java.util.Scanner;

public class Sounds_fishy_6764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fish = new int[4];
        int inc = 0, dec = 0, same = 0;
        for (int i = 0; i < 4; i++)
            fish[i] = sc.nextInt();
    
        for (int i = 0; i < 3; i++) {
		    if (fish[i] < fish[i + 1])
			    inc += 1;
		    else if (fish[i] > fish[i + 1])
			    dec += 1;
		    else if (fish[i] == fish[i + 1])
		    	same += 1;
	    }

        if (inc == 3)
		    System.out.println("Fish Rising");
	    else if (dec == 3)
		    System.out.println("Fish Diving");
	    else if (same == 3)
		    System.out.println("Fish At Constant Depth");
	    else if (inc != 3 || dec != 3 || same != 3)
		    System.out.println("No Fish");
    }
}
