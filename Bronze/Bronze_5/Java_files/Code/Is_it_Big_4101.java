import java.util.Scanner;

public class Is_it_Big_4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        while(a != 0 && b != 0) {
            System.out.println((a > b) ? "Yes" : "No");
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
