package Step_6;
import java.util.Scanner;

public class Sangsu_2908 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

		n1 = n1 / 100 + ((n1 / 10) % 10) * 10 + ((n1 % 100) % 10) * 100;
	    n2 = n2 / 100 + ((n2 / 10) % 10) * 10 + ((n2 % 100) % 10) * 100;

	    if(n1 < n2)
            System.out.println(n2);
	    else
            System.out.println(n1);
	}
}
