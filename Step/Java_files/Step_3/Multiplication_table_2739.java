package Step_3;
import java.util.Scanner;

public class Multiplication_table_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            int m = i * a;
            System.out.println(a + " * " + i + " = " + m);
        }
    }
}
