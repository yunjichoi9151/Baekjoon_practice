import java.util.Scanner;

public class Clock_24356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt(), m1 = sc.nextInt(), t2 = sc.nextInt(), m2 = sc.nextInt(), diff;
        m1 += t1 * 60;
        m2 += t2 * 60;
        if (m1 > m2)
            m2 += 24 * 60;
        diff = m2 - m1;
        System.out.println(diff + " " + diff / 30);
    }
}
