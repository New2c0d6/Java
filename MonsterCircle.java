import java.util.*;
public class MonsterCircle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        sc.close();
        for(int i=0;;i++){
            if(arr[i % n]-i <= 0){
                System.out.println((i%n)+1);
                break;
            }
		}
    }
}
