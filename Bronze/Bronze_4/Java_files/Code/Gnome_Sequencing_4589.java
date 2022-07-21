import java.util.Scanner;

public class Gnome_Sequencing_4589 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Gnomes:");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if ((a <= b && b <= c) || (c <= b && b <= a))
                System.out.println("Ordered");
            else
                System.out.println("Unordered");
        }
    }
}
