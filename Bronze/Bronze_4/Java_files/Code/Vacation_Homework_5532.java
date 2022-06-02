import java.util.Scanner;

public class Vacation_Homework_5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if ((a / c) > (b / d))
            if (a % c == 0)
                System.out.println(l - (a / c));
            else
                System.out.println(l - (a / c + 1));
        else
            if (b % d == 0)
                System.out.println(l - (b / d));
            else
                System.out.println(l - (b / d + 1));
    }
}
