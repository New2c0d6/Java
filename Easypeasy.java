import java.util.*;
public class Easypeasy {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] oddEven = new int[n];
        ArrayList<Integer> idxArr = new ArrayList<Integer>();
        int evenCount =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){
                oddEven[i] = 0;
                evenCount++;
            }else{
                oddEven[i] = 1;
            }
        }
        sc.close();
        int noOfSwitch;
        if(evenCount < n-evenCount){
            noOfSwitch = evenCount;
        }else{
            noOfSwitch = n-evenCount;
        }
        while(noOfSwitch-- > 0){
            int idxSwitch = smallest(arr, idxArr);
            switchidx(arr, oddEven, idxSwitch, idxArr); 
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
   }
    public static int smallest(int[] arr, ArrayList<Integer> idxArr) {
       int min = Integer.MAX_VALUE;
       int idx = 0;
        for(int i =0; i<arr.length; i++){
            if(idxArr.indexOf(i) != -1){
                continue;
            }
            if(arr[i] < min){
                min = arr[i];
                idx = i;
            }
       }
       //System.out.println(idx);
       return idx;
   }
   public static void switchidx(int[] arr, int[] oddEven, int idxSwitch, ArrayList<Integer> idxArr){
       for(int i = 0; i <= idxSwitch; i++){
           if(oddEven[i] + oddEven[idxSwitch] == 1){
               int temp = arr[i];
               arr[i] = arr[idxSwitch];
               arr[idxSwitch] = temp;
               idxArr.add(i);
               //System.out.println(idxArr.toString());
               break;
           }
       }
   }
}
