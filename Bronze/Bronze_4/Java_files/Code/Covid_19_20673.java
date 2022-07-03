import java.util.Scanner;

public class Covid_19_20673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), q = sc.nextInt();
        if (q > 30)
            System.out.println("Red");
        else if (p <= 50 && q <= 10)
            System.out.println("White");
        else
            System.out.println("Yellow");
    }
}
