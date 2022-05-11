import java.util.Scanner;

public class Scale_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1;
        int [] input = new int[10];
        for (int i = 0; i < 8; i++) {
            input[i] = sc.nextInt();
        }
    
        for (int i = 0; i < 8; i++) {
            if (input[i] != i + 1) {
                a = 0;
                break;
            }
        }
    
        for (int i = 0; i < 8; i++) {
            if (input[i] != 8 - i) {
                b = 0;
                break;
            }
        }
    
        if (a == 0 && b == 0)
            System.out.println("mixed");
        else if(a == 1)
            System.out.println("ascending");
        else if(b == 1)
            System.out.println("descending");
    }
}
