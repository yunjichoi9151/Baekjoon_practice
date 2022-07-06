import java.util.Scanner;

public class Checkers_21631 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        System.out.println((a >= b) ? b : a + 1);
    }
}
