import java.util.Scanner;

public class Can_you_add_this_7891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long t = sc.nextLong();
        for (int i = 0; i < t; i++) {
            Long x = sc.nextLong(), y = sc.nextLong();
            System.out.println(x + y);
        }
    }
}
