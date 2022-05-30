import java.util.Scanner;

public class Counting_Antibodies_24860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long vk = sc.nextLong();
        long jk = sc.nextLong();
        long va = sc.nextLong();
        long ja = sc.nextLong();
        long vh = sc.nextLong();
        long dh = sc.nextLong();
        long jh = sc.nextLong();

        System.out.println((vh * dh * jh) * (vk * jk + va * ja));
    }
}
