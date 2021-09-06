import java.util.*;
class Monster {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int h = sc.nextInt();
		int[] power = new int[n];
		int[] weight =new int[n];
		for(int i = 0; i<n; i++){
			power[i] = sc.nextInt();
		}
		for(int j = 0; j<n; j++){
			weight[j] = sc.nextInt();
		}
        sc.close();
		List<Integer> validPow = new ArrayList<Integer>();
		for (int i = 0; i < weight.length; i++) {
			if(weight[i] <= d){
				validPow.add(power[i]);
			}
		}
		Collections.sort(validPow);
		int weapons =0;
		int ans = -1;
		for(int l = validPow.size()-1; l >=0; l--){
			h -= validPow.get(l);
			weapons++;
			if(h <= 0){
				ans = weapons;
				break;
			}
		}
		System.out.println(ans);
	}
}
