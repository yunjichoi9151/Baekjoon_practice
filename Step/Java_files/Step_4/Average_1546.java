package Step_4;
import java.util.Scanner;

public class Average_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, m = 0;
        int n = sc.nextInt();
        double [] numArr = new double[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
            if (m < numArr[i]) {
                m = numArr[i];
            }
        }
    
        for (int i = 0; i < n; i++) {
            sum += numArr[i] / m * 100;
        }
        
        System.out.println(sum / n);
    }
}
