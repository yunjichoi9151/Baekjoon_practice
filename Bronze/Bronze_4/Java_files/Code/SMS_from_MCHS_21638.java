import java.util.Scanner;

public class SMS_from_MCHS_21638 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt(), v1 = sc.nextInt(), t2 = sc.nextInt(), v2 = sc.nextInt();
        if (t2 < 0 && v2 >= 10)
            System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
        else if (t1 > t2)
            System.out.println("MCHS warns! Low temperature is expected tomorrow.");
        else if (t1 <= t2 && v1 < v2)
            System.out.println("MCHS warns! Strong wind is expected tomorrow.");
        else
            System.out.println("No message");
    }
}
