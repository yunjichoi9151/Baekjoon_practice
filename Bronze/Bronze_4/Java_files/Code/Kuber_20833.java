import java.util.Scanner;
import java.lang.Math;

public class Kuber_20833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++)
            sum += Math.pow(i, 3);
        System.out.println(sum);
    }
}
