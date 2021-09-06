import java.util.Scanner;

public class PrefixSub {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        sc.close();
        int min = arr[0].length();
        for(int i =0; i<n; i++){
            if(arr[i].length() < min){
                min = arr[i].length();
            }
        }
        int idx = -1;
        int flag = 0;
        for(int i =0; i<min; i++){
            char ch = arr[0].charAt(i);
            for(int j =0; j<n; j++){
                if(ch != arr[j].charAt(i)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                idx = i;
            }else{
                break;
            }
        }
        if(idx != -1){
            System.out.println(arr[0].substring(0, idx+1));
        }else{
            System.out.println(-1);
        }
	}
}
