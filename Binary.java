import java.util.*;
class Binary{
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

			int flag = 0;
			for(int i = 0; i<m; i++){
				for(int j=0; j<n; j++){
					if(arr[i][j] == k){
					System.out.println("Yes");
					flag = 1;
					}
				}
			}
			if(flag == 0)
				System.out.println("No");
		}	
	sc.close();
	}
}