import java.util.*;
class Anagram{
    /* n*n approach
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		if(s1.length() != s2.length()){
			System.out.println("No");
		}else{
        int flag = 0;
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> countArr = new ArrayList<Integer>();
		for(int i =0; i<s1.length(); i++){
			int idx = sb.indexOf(String.valueOf(s1.charAt(i)));
			if(idx == -1){
				sb.append(s1.charAt(i));
				countArr.add(1);
			}else{
				countArr.set(idx, countArr.get(idx) + 1);
			}
		}
		for(int i =0; i<s2.length(); i++){
			int count=0;
			char el = s2.charAt(i);
			if(sb.indexOf(String.valueOf(el)) == -1){
				flag = 1;
                break;
			}else{
				for(int j =0; j<s2.length(); j++){
					if(s2.charAt(j) == el){
						count++;
					}
				}
				int idx2 = sb.indexOf(String.valueOf(el));
				if(count != countArr.get(idx2)){
					flag = 1;
                    break;
				}
			}
		}
		if(flag == 1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
		}
	}
    */
    // n*logn approach
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		if(s1.length() != s2.length()){
			System.out.println("NO");
		}else{
		int flag = 0;
        char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0; i< arr1.length; i++){
			if(arr1[i] != arr2[i]){
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
		}
	}
}