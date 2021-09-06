import java.util.*;
public class Rightmost {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextLong();
		}
        sc.close();
		int index;
		for(int j =0; j<n; j++){
			index = j+1;
			int k = n-1;
			while(k >= j){
				if(arr[j] <= arr[k]){
					index = k+1;
					break;
				}
				k--;
			}
			System.out.print(index + " ");
		}

	}
}

