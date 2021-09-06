import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BufferedReader {
	
    public static void main (String[] args) {
		/*
		try{
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			String s1 = bf.readLine();
			String[] inp1 = s1.split("\\s");
			int m = Integer.parseInt(inp1[0]);
			int n = Integer.parseInt(inp1[1]);
			int q = Integer.parseInt(inp1[2]);
			long[][] arr = new long[m][n];
			for(int i = 0; i< m; i++){
				String s2 = bf.readLine();
				String[] inp2 = s2.split("\\s");
				for(int j =0; j< n; j++){
				arr[i][j] = Long.parseLong(inp2[j]);
				}
			}
			for(int i = 0; i< m; i++){
				Arrays.sort(arr[i]);
			}
			for(int x = 1; x<= q; x++){
				long k = Long.parseLong(bf.readLine());
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
			bf.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
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
	*/	
	}
}
