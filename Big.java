import java.util.*;

class Big{
    /*
    Hawkeye has been assigned to eliminate n monsters, the ith of which is of type ai. In one move, he can do either of the following:

    i. Shoot down atmost any k monsters. In other words, he can shoot down any set of monsters such that the size of that set is smaller than or equal to k.
    ii. Shoot down all monsters of any one type.
    
    Find the minimum number of moves it will take him to shoot down all the monsters.
    Input
    The first line contains one integer t — the number of test cases. Each test case consists of two lines.
    The first line contains two space-separated integers n and k.
    The second line contains n space-separated integers a1, a2 . . . an.
    
    Constraints:
    1 ≤ t ≤ 105
    1 ≤ k ≤ n ≤ 105
    1 ≤ ai ≤ n
    The sum of n over all test cases does not exceed 105.
    Output
    For each test case, print a single value - the minimum number of moves required.

Sample input
3
7 2
1 2 3 4 4 4 4
5 3
1 2 3 1 2
5 3
5 5 5 5 5

Sample output
3
2
1

Explanation:
For the first test case, the minimum moves required is 3. One way to do so is that Hawkeye can first shoot monsters 1 and 2 in one move using the second operation. 
Then he can shoot down all monsters of type 4 using the first operation, followed by shooting monster 3 by either method.
    */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        int k;
        while(t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int dup =0;
            int el;
            for(int j=0; j<n; j++){
                el = arr[j];
                if(contains(arr, el, 0, j)){
                    continue;
                }
                for(int y = j+1; y<n; y++){
                    if(arr[y] == el){
                        dup++;
                        break;
                    }
                }
                count++;
            }
            int num = count - dup;
            int ans;
            if(num % k == 0){
                ans = (num/k) + dup;
            }else{
                ans = (num/k) + 1 + dup;
            }
            if(n % k == 0){
                if(ans < (n/k)){
                    System.out.println(ans);
                }else{
                    System.out.println(n/k);
                }
            }else{
                if(ans < ((n/k)+1)){
                    System.out.println(ans);
                }else{
                    System.out.println(n/k+1);
                }
            }
        }
        sc.close();
	}
    public static boolean contains(int[] arr,int el, int start, int end){
        for(int x = start; x < end; x++){
            if(arr[x] == el){
                return true;
            }
        }
        return false;
    }
}