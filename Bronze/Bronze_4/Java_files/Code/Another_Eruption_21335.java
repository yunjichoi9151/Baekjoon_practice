import java.util.Scanner;
import java.lang.Math;

public class Another_Eruption_21335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), PI = 3.1415926535897932384;
        System.out.println(String.format("%.10f", Math.sqrt(a / PI) * 2 * PI));
    }
}
