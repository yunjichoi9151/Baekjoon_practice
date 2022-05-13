package Step_6;
import java.util.Scanner;

public class Find_Alphabet_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];

        for(int i = 0; i < 26; i++){
            alphabet[i] = -1;
        }
        
        String word = sc.next();
        
        for(int i = 0; i < word.length(); i++){
            if(alphabet[word.charAt(i) - 'a'] == -1){
                alphabet[word.charAt(i) - 'a'] = i;
            }  
        }
        
        for(int i = 0; i < 26; i++){
            System.out.printf("%d ", alphabet[i]);
        }
    }
}
