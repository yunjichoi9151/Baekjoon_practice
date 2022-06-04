import java.util.Scanner;
import java.math.BigInteger;

public class Tabliczka_8674 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.remainder(BigInteger.valueOf(2));
        BigInteger d = b.remainder(BigInteger.valueOf(2));
        if (c == (BigInteger.valueOf(0)) || d == (BigInteger.valueOf(0)))
            System.out.println("0");
        else
            System.out.println((a.compareTo(b) == 1) ? b : a);
    }
}
