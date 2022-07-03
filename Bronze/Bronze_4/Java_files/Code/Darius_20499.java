import java.util.Scanner;

public class Darius_20499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String num[] = s.split("/");
        System.out.println((Integer.parseInt(num[0]) + Integer.parseInt(num[2]) < Integer.parseInt(num[1]) || Integer.parseInt(num[1]) == 0) ? "hasu" : "gosu");
    }
}
