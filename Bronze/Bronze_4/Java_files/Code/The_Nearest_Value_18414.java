import java.util.Scanner;
import java.lang.Math;

public class The_Nearest_Value_18414 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
        if (l < x && x < r)
            System.out.println(x);
        else
            System.out.println((Math.abs(l - x) > Math.abs(r - x)) ? r : l);
    }
}
