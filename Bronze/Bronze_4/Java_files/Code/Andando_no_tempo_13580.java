import java.util.Scanner;

public class Andando_no_tempo_13580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == b || b == c || c == a || a + b == c || b + c == a || c + a == b)
            System.out.println("S");
        else
            System.out.println("N");
    }
}
