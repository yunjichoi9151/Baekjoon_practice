package Step_6;
import java.util.Scanner;

public class Sum_of_Numbers_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        String numArr = sc.next();
        for (int i = 0; i < n; i++) {
            sum += numArr.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
