import java.util.Scanner;
import java.lang.Math;

public class Cutting_Corners_20215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble(), h = sc.nextDouble();
        System.out.println((w + h) - (Math.sqrt(w * w + h * h)));
    }
}
