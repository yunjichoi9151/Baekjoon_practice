import java.util.Scanner;

public class Schronisko_8760 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for (int i = 0; i < z; i++) {
            int w = sc.nextInt(), k = sc.nextInt();
            System.out.println((w * k) / 2);
        }
    }
}
