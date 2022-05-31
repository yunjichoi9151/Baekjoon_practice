import java.util.Scanner;

public class Multiplication_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int x = b / 100;
        int z = b % 10;
        int y = (b - (x * 100 + z)) / 10;

        System.out.println(a * z);
        System.out.println(a * y);
        System.out.println(a * x);
        System.out.print(a * b);
    }
}
