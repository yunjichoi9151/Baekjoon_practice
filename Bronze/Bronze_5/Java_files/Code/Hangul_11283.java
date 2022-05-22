import java.math.BigInteger;
import java.util.Scanner;

public class Hangul_11283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char result = a.charAt(0);
        System.out.println(((int) result) - 44031);
    }
}
