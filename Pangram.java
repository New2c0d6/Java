import java.util.*;
class Pangram{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = "abcdefghijklmnopqrstuvwxyz";
		while(n-- > 0){
			String str = sc.nextLine();
			String strL = str.toLowerCase();
			int count = 0;
			for(int i = 0; i<26; i++){
				if(strL.contains(String.valueOf(s.charAt(i)))){
					count++;
				}
			}
			if(count == 26){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
        sc.close();
	}
}