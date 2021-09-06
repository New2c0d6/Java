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
        int flag = 0;
        int p = 0;
        while(flag != 1){
            if(arr[p%(arr.length)] <= 0){
                flag = 1;
            }else{
                arr[p%(arr.length)] -= p; 
            }
        }
    }
}
