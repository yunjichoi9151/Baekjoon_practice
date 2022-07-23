import java.util.Scanner;

public class Missa_Reversal_21665 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), sum = 0;
        char arr1[][] = new char[n][m];
        char arr2[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++)
                arr1[i][j] = s.charAt(j);
        }
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++)
                arr2[i][j] = s.charAt(j);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((arr1[i][j] == 'B' && arr2[i][j] == 'W') || (arr1[i][j] == 'W' && arr2[i][j] == 'B'))
                    continue;
                else
                    sum++;
            }
        }
        System.out.println(sum);
    }
}
