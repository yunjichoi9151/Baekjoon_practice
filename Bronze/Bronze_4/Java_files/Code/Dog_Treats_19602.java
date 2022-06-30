import java.util.Scanner;

public class Dog_Treats_19602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt();
        System.out.println((s + m * 2 + l * 3 >= 10) ? "happy" : "sad");
    }
}
