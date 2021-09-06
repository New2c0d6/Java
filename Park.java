import java.util.*;
public class Park {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = n/m +1;
        System.out.println(ans);
    }
}
