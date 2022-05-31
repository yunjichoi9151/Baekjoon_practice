import java.util.Scanner;

public class TV_Size_1297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        double x = Math.sqrt(h * h + w * w);
        double num1 = h * d / x;
        double num2 = w * d / x;

        System.out.println((int)num1 + " " + (int)num2);
    }    
}
