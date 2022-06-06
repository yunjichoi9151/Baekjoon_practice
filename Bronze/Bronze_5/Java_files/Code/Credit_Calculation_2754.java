import java.util.Scanner;

public class Credit_Calculation_2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        double score = 4.0;
        if (str.charAt(0) == 'F') {
            System.out.println("0.0");
            System.exit(0);
        }
        score -= str.charAt(0) - 'A';
        if (str.charAt(1) == '+')
            score += 0.3;
        if (str.charAt(1) == '-')
            score -= 0.3;
        System.out.println(String.format("%.1f", score));
    }
}
