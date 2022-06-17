import java.util.Scanner;

public class Two_Chickens_14489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(((a + b) >= c * 2) ? (a + b) - (c * 2) : a + b);
    }
}
