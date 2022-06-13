import java.util.Scanner;

public class Do_Not_Touch_Anything_13136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double c = sc.nextDouble();
        double n = sc.nextDouble();
        System.out.println((long) Math.ceil(r / n) * (long) Math.ceil(c / n));
    }
}
