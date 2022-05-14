package Step_7;
import java.util.Scanner;

public class Fraction_number_1193 {
    public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int i, b = 1;

        for (i = 1; a > b; )
        b += ++i;
    
        if (i % 2 == 0)
            System.out.println((i - (b - a)) + "/" + (1 + (b - a)));
        else
            System.out.println((1 + (b - a)) + "/" + (i - (b - a)));
	}
}
