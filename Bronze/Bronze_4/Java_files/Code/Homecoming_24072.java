import java.util.Scanner;

public class Homecoming_24072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > c)
            System.out.println("0");
        else {
            if (b <= c)
                System.out.println("0");
            else
                System.out.println("1");
        }
    }
}
