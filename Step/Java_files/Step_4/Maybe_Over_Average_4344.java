package Step_4;
import java.util.Scanner;

public class Maybe_Over_Average_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float avg;
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int sum = 0;
            int n = sc.nextInt();
            int[] score = new int[n];
            for(int j = 0; j < n; j++) {
                int s = sc.nextInt();
                score[j] = s;
                sum += score[j];
            }
            avg = (float)sum / (float)n;
            sum = 0;
            for(int j = 0; j < n; j++) {
                if(avg < score[j]) {
                    sum++;
                }
            }
            avg = (float)sum / (float)n * 100;
            System.out.println(String.format("%.3f", avg)+"%");
        }
    }
}
