import java.util.*;
public class Happy {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long[] choco = new long[a];
		long[] orange = new long[b];
		long[] unkown = new long[c];
		for(int i = 0; i<a; i++){
			choco[i] = sc.nextLong();
		}
		for(int j = 0; j<b; j++){
			orange[j] = sc.nextLong();
		}
		for(int k = 0; k<c; k++){
			unkown[k] = sc.nextLong();
		}
		sc.close();
		Arrays.sort(choco);
		Arrays.sort(orange);
		Arrays.sort(unkown);
		long[] newArr = new long[x+y+c];
		System.arraycopy(choco, choco.length-x, newArr, 0, x);
		System.arraycopy(orange, orange.length-y, newArr, x, y);
		System.arraycopy(unkown, unkown.length, newArr, x+y, unkown.length);
		Arrays.sort(newArr);
		long happiness = 0;
		int candies = 0;
		for (int i = newArr.length-1; i >=0; i--) {
			happiness += newArr[i];
			candies++;

			if(candies == x+y) {
				break;
			}
		}
		System.out.print(happiness);
	}
}
