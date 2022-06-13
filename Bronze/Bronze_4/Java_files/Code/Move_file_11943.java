import java.util.Scanner;

public class Move_file_11943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println((a + d < b + c) ? a + d : b + c);
    }
}
