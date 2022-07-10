import java.util.Scanner;

public class Hour_Hand_24083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println((a + b) % 12 == 0 ? 12 : (a + b) % 12);
    }
}
