import java.util.Scanner;

public class Gamble_for_Fun_23795 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, sum = 0;
        while (n != -1) {
            n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum + 1);
    }
}
