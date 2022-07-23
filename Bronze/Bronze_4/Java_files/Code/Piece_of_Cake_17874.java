import java.util.Scanner;

public class Piece_of_Cake_17874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(), h = sc.nextDouble(), v = sc.nextDouble();
        if (n / 2 > h)
            h = n - h;
        if (n / 2 > v)
            v = n - v;
        System.out.println((int)(4 * (h * v)));
    }
}
