import java.util.Scanner;

public class Moving_24079 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        System.out.println(((x + y) <= (z + 0.5)) ? "1" : "0");
    }
}
