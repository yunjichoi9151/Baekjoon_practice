package Step_4;
import java.util.Scanner;

public class OX_Quiz_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int score = 1;
            String string = sc.next();
            for(int j = 0; j < string.length(); j++) {
                if(string.charAt(j) == 'O') {
                    sum += score;
                    score++;
                }
                if(string.charAt(j) == 'X') {
                    score = 1;
                }
            }
            System.out.println(sum);
        }
    }
}
