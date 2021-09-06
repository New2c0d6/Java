import java.util.*;
public class TwoDBinary {
    
    /* Approach1

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int q = sc.nextInt();
		long[][] arr = new long[m][n];
		for(int i = 0; i< m; i++){
			for(int j=0; j<n; j++){
			arr[i][j] = sc.nextInt();
			}
		}
		for(int x = 1; x<= q; x++){
			long k = sc.nextLong();

			int flag = -1;
			for(int i = 0; i<m; i++){
				Arrays.sort(arr[i]);
				flag = isPresent(arr[i], n, k);
				if(flag == 1){
					System.out.println("Yes");
					break;
				}
			}
			if(flag == -1){
				System.out.println("No");
			}
		}	
	sc.close();
	}
	public static int isPresent(long arr[], int n, long k){
	int s = 0;
	int e = n-1;
	int result = -1;
	while(s<=e){
		int mid = (s+e)/2;
		if(arr[mid] == k){
			return 1;
		}
		if(arr[mid] < k){
			s = mid+1;
		}else{
			e = mid-1;
		}
	}
	return result;	
	}

    */

    /* Approach2

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int q = sc.nextInt();
		long[] arr = new long[m*n];
		for(int i = 0; i< m*n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int x = 1; x<= q; x++){
			long k = sc.nextLong();
			int flag = -1;
			Arrays.sort(arr);
			flag = isPresent(arr, m*n, k);
			if(flag == 1){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		sc.close();

	}	
	
	public static int isPresent(long arr[], int n, long k){
	int s = 0;
	int e = n-1;
	int result = -1;
	while(s<=e){
		int mid = (s+e)/2;
		if(arr[mid] == k){
			return 1;
		}
		if(arr[mid] < k){
			s = mid+1;
		}else{
			e = mid-1;
		}
	}
	return result;	
	}

    */


    /* Approach3

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int q = sc.nextInt();
		long[] arr = new long[m*n];
		for(int i = 0; i< m*n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int x = 1; x<= q; x++){
			long k = sc.nextLong();
			int flag = -1;
			for(int i =0; i<arr.length; i++){
				if(arr[i] == k){
					flag =1;
					break;
				}
			}
			if(flag == 1){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		sc.close();

	}
    */

    /*Approach 4 

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int q = sc.nextInt();
		long[][] arr = new long[m][n];
		for(int i = 0; i< m; i++){
			for(int j=0; j<n; j++){
			arr[i][j] = sc.nextInt();
			}
		}
		for(int x = 1; x<= q; x++){
			long k = sc.nextLong();;
			flag = -1;
			for(int i = 0; i< m; i++){
				for(int j=0; j<n; j++){
					if(arr[i][j] == k){
						flag = 1;
						break;
					}
				}
			}
			if(flag == 1){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		
	}
    */

    /* Approach 5 (best approach)
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int q = sc.nextInt();
		long[][] arr = new long[m][n];
		for(int i = 0; i< m; i++){
			for(int j=0; j<n; j++){
			arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i< m; i++){
			Arrays.sort(arr[i]);
		}
		for(int x = 1; x<= q; x++){
			long k = sc.nextLong();
			int flag = -1;
			for(int i = 0; i<m; i++){
				flag = isPresent(arr[i], n, k);
				if(flag == 1){
					System.out.println("Yes");
					break;
				}
			}
			if(flag == -1){
				System.out.println("No");
			}
		}	
	sc.close();
	}
	public static int isPresent(long arr[], int n, long k){
	int s = 0;
	int e = n-1;
	int result = -1;
	while(s<=e){
		int mid = (s+e)/2;
		if(arr[mid] == k){
			return 1;
		}
		if(arr[mid] < k){
			s = mid+1;
		}else{
			e = mid-1;
		}
	}
	return result;	
	}
    */
}
