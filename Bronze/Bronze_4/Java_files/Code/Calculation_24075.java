import java.util.Scanner;

public class Calculation_24075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if ((a + b) > (a - b)) {
            System.out.println(a + b);
            System.out.println(a - b);
        }
        else {
            System.out.println(a - b);
            System.out.println(a + b);
        }
    }
}
