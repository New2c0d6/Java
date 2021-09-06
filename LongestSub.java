import java.util.*;
public class LongestSub {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0){
			String str = sc.nextLine().toLowerCase();
			StringBuilder sb = new StringBuilder();
			String result = new String();
            int s =0;
			while(s< str.length()) {
				if(sb.indexOf(String.valueOf(str.charAt(s))) == -1){
					sb.append(str.charAt(s));
                    s++;
				}else{
					
					if(result.length() < sb.length()){
						result = sb.toString();
					}
					int delIdx = sb.indexOf(String.valueOf(str.charAt(s)));
                    sb.delete(0, delIdx+1);
				}
			}
            if(result.length() <= sb.length()){
			    System.out.println(sb.length());
            }else{
                System.out.println(result.length());
            }
		}
        sc.close();
	}

	/*
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0){
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				if(sb.indexOf(String.valueOf(str.charAt(i))) == -1){
					sb.append(str.charAt(i));
				}
			}
			System.out.println(sb.length());
		}
        sc.close();
	}
	*/
}
