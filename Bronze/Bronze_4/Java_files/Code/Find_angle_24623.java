import java.util.Scanner;

public class Find_angle_24623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(), a = sc.nextDouble();
        System.out.println((int)((180 - a) / 2 + a / 2));
    }
}
