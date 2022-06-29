import java.util.Scanner;

public class Math_is_Physical_2_17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            if (n % 8 == 0 || n % 8 == 2)
                System.out.println("2");
            else if (n % 8 == 4 || n % 8 == 6)
                System.out.println("4");
        }
        else {
            if (n % 4 == 3)
                System.out.println("3");
            else if (n % 8 == 1)
                System.out.println("1");
            else if (n % 8 == 5)
                System.out.println("5");
        }
    }
}
