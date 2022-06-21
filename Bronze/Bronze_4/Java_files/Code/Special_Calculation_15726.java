import java.util.Scanner;

public class Special_Calculation_15726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int x = (int)((a * b) / c);
        int y = (int)((a / b) * c);
        System.out.println((x > y) ? x : y);
    }
}
