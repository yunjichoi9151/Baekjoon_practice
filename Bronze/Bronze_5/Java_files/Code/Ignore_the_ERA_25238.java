import java.util.Scanner;

public class Ignore_the_ERA_25238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a * (100 - b) / 100) < 100 ? 1 : 0);
    }
}
