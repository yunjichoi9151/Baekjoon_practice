import java.util.Scanner;

public class Von_Neumann_and_fly_14924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), t = sc.nextInt(), d = sc.nextInt();
        System.out.println((d / (s * 2)) * t);
    }
}
