import java.util.Scanner;

public class Arm_Coordination_23375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), r = sc.nextInt();
        System.out.println((x - r) + " " + (y + r));
        System.out.println((x + r) + " " + (y + r));
        System.out.println((x + r) + " " + (y - r));
        System.out.println((x - r) + " " + (y - r));
    }
}
