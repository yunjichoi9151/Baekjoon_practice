import java.util.Scanner;

public class Zero_or_One_13623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == b && b == c && c == a)
            System.out.println("*");
        else {
            if (a == b)
                System.out.println("C");
            if (b == c)
                System.out.println("A");
            if (c == a)
                System.out.println("B");
        }
    }
}
