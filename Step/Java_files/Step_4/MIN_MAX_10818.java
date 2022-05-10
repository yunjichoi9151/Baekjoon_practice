package Step_4;
import java.util.Scanner;

public class MIN_MAX_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000001;
        int max = -1000001;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        System.out.println(min + " " + max);
    }
}
