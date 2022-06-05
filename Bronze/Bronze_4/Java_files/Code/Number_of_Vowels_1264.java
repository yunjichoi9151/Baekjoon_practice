import java.util.Scanner;

public class Number_of_Vowels_1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            String s = sc.nextLine();
            int count = 0;
            if(s.equals("#"))
                break;
            for (int i = 0;  i < s.length() - 1; i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U')
                    count++;
            }
            System.out.println(count);
        }
    }
}
