import java.io.*;

public class Empathy_14623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b1 = br.readLine();
        String b2 = br.readLine();

        long b3 = Long.parseLong(b1, 2);
        long b4 = Long.parseLong(b2, 2);

        String s = Long.toBinaryString(b3 * b4);

        System.out.println(s);
    }
}
