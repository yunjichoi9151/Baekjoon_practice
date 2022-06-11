import java.util.Scanner;

public class Tournament_Selection_14038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 6; i++) {
            char s = sc.next().charAt(0);
            if (s == 'W')
                count++;
        }
        if (count == 0)
            System.out.println("-1");
        else if (count >= 5)
            System.out.println("1");
        else if (count >= 3)
            System.out.println("2");
        else
            System.out.println("3");
    }
}
