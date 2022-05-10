package Step_2;
import java.util.Scanner;

public class Oven_Clock_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a * 60 + b + c;
        int h = d / 60;
        int m = d % 60;

        if (h > 23)
            h -= 24;

        System.out.println(h + " " + m);
    }
}
