import java.util.Scanner;

public class The_Merchant_of_Venice_13496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), sum = 0;
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt(), s = sc.nextInt(), d = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int d_i = sc.nextInt(), v_i = sc.nextInt();
                if (s * d >= d_i)
                    sum += v_i;
            }
            System.out.println("Data Set " + (i + 1) + ":");
            System.out.println(sum);
            System.out.println();
            sum = 0;
        }
    }
}
