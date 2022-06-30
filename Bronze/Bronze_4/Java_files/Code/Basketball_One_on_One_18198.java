import java.util.Scanner;

public class Basketball_One_on_One_18198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Arr = sc.next();
        int sum_a = 0, sum_b = 0;
        
        for (int i = 0; i < Arr.length(); i += 2) {
            if (Arr.charAt(i) == 'A') {
                int tmp = Arr.charAt(i + 1) -'0';
                sum_a += tmp;
            }
            else if (Arr.charAt(i) == 'B') {
                int tmp = Arr.charAt(i + 1) -'0';
                sum_b += tmp;
            }
        }
        System.out.println((sum_a > sum_b) ? 'A' : 'B');
    }
}
