import java.util.*;
public class Rowsof1 {
    /*
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
            for (int j = 0; j < m; j++) {
                arr.get(i).add(j, sc.nextInt());
            }
        }
        sc.close();
        int idx1 = -1;
        int result = m;
        int column = 0;
        for (int i = 0; i < n; i++) {
            idx1 = arr.get(i).indexOf(1);
            if(idx1 < result){
                result = idx1;
                column = i;
            }
        }
        System.out.println(column);
	}
    */

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < m; i++) {
                arr.add(new ArrayList<Integer>());
                for (int j = 0; j < n; j++) {
                    arr.get(i).add(j, sc.nextInt());
                }
            }
            int idx1 =-1;
            for (int i = 0; i < m; i++) {
                idx1 = arr.get(i).indexOf(1);
                if(idx1 != -1){
                arr.set(i, oneList(n));
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
        sc.close();
       
	}
    public static ArrayList<Integer> oneList(int n){
        ArrayList<Integer> inArr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            inArr.add(1);
        }
        return inArr;
    }
}
