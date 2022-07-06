import java.util.Scanner;

public class Laptop_Sticker_21591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w_c = sc.nextInt(), h_c = sc.nextInt(), w_s = sc.nextInt(), h_s = sc.nextInt();
        System.out.println(((w_c - 2 >= w_s) && (h_c - 2 >= h_s)) ? 1 : 0);
    }
}
