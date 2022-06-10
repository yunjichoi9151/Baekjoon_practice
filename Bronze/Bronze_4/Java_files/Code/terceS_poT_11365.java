import java.util.Scanner;

public class terceS_poT_11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.nextLine();
            if (s.equals("END"))
                break;
            System.out.println(new StringBuffer(s).reverse().toString());
        }
    }
}
