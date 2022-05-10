package Step_5;

public class Sum_of_N_Integers_15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++){
            ans += a[i];
        }
        return ans;
    }
}
