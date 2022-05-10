package Step_4;
import java.util.Scanner;

public class Where_MAX_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numArr = new int[9];
        for(int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();	
		}
        int index = 0, max = 0;
        for(int i = 0; i < 9; i++) {
            if (max < numArr[i]) {
                max = numArr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}