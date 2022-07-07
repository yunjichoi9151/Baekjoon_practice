import java.util.Scanner;

public class Bank_Transfer_21633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        double tmp = 25 + k * 0.01;
        if (tmp < 100)
            System.out.println(String.format("%.2f",100.0));
        else if (tmp > 2000)
            System.out.println(String.format("%.2f",2000.0));
        else
            System.out.println(String.format("%.2f", tmp));
    }
}
