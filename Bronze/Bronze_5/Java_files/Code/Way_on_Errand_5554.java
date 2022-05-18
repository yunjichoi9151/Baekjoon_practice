import java.util.Scanner;

public class Way_on_Errand_5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int t = sc.nextInt();
            sum += t;
        }
        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
