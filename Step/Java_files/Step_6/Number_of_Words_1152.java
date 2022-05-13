package Step_6;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Number_of_Words_1152 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		String S = sc.nextLine();
 
		StringTokenizer token = new StringTokenizer(S, " ");
		
		System.out.println(token.countTokens());	
	}
}
