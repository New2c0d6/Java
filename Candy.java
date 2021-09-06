import java.util.*;
public class Candy {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long t=sc.nextLong();
        sc.close();
        long minX=1,maxX=1000000000;
        while(minX<=maxX){
            long mid=minX+(maxX-minX)/2;
            long ans=answer(mid, a, b);
            if(ans<=t){
                minX=mid+1;
            }
            else{
                maxX=mid-1;
            }
        }
    
        if(answer(maxX, a, b)<=t){
            System.out.print(maxX);
        }
        else{
            System.out.print(minX);
        }
        }
    public static long answer(long middle, long A, long B){
        long temp=middle,count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        return A*middle+B*count;
    }
}
