import java.util.Scanner;

public class Bottle_Return_21300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            int a = sc.nextInt();
            sum += a;
        }
        System.out.println(sum * 5);
    }
}
