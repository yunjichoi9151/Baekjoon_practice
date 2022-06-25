import java.util.Scanner;

public class Calculate_Age_16199 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt(), m1 = sc.nextInt(), d1 = sc.nextInt(), y2 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt(), a, b, c;
        c = y2 - y1;
        b = c + 1;
        if ((m1 == m2 && d1 <= d2) || (m1 < m2))
            a = y2 - y1;
        else
            a = y2 - y1 - 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
