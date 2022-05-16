import java.util.Scanner;

public class After_the_Party_2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int p = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            System.out.printf("%d ", a - l * p);
        }
    }
}
