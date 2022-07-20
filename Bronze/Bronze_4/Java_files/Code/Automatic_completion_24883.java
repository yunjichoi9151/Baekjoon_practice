import java.util.Scanner;

public class Automatic_completion_24883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println((s.equals("N") || s.equals("n")) ? "Naver D2" : "Naver Whale");
        sc.close();
    }
}
