import java.util.Scanner;

public class Microwave_14470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), sum = 0;
        if (a < 0)
            sum += (0 - a) * c + d + b * e;
        else
            sum += (b - a) * e;
        System.out.println(sum);
    }
}
