import java.util.Scanner;

public class Petrol_18330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        if (n < 60 + k)
            System.out.println(n * 1500);
        else
            System.out.println((n - (60 + k)) * 3000 + (60 + k) * 1500);
    }
}
