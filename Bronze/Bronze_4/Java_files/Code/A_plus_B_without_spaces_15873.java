import java.util.Scanner;

public class A_plus_B_without_spaces_15873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(100 > n)
        System.out.println(n / 10 + n % 10);
        else if(n % 10 == 0)
            System.out.println(n / 100 + 10);
        else
            System.out.println(n % 100 + 10);
    }
}
