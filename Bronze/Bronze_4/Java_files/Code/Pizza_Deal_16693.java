import java.util.Scanner;

public class Pizza_Deal_16693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble(), p1 = sc.nextDouble(), r1 = sc.nextDouble(), p2 = sc.nextDouble();
        System.out.println((a1 * p2 > r1 * r1 * 3.1415926535 * p1) ? "Slice of pizza" : "Whole pizza");
    }    
}
