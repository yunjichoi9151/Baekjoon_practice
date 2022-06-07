import java.util.Scanner;

public class Trial_task_8545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
    }
}
