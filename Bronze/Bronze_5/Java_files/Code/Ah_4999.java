import java.util.Scanner;

public class Ah_4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int count1 = 0, count2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a')
                count1 += 1;
            else
                break;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a')
                count2 += 1;
            else
                break;
        }
        System.out.println((count1 >= count2) ? "go" : "no");
    }
}
