import java.util.Scanner;

public class Exam_Score_5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, i, sum_1 = 0, sum_2 = 0;
        for (i = 0; i < 4; i++) {
            s = sc.nextInt();
            sum_1 += s;
        }
        for (i = 0; i < 4; i++) {
            s = sc.nextInt();
            sum_2 += s;
        }
        System.out.println((sum_1 >= sum_2) ? sum_1 : sum_2);
    }
}
