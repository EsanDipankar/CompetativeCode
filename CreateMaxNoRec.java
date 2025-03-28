import java.util.*;
public class CreateMaxNoRec {
    public static int getmaxSize(int[] arr, int B){
        int n=arr.length-1;
        int L=0; int R=0;
        int ans=0;
        while( R<=n){
            int area= arr[L]*arr[R];
            if(area<B && L==R){
                ans=ans+1;
            }else if(area<B && L !=R){
                ans=ans+2;
            }
            R++;
        }
        R-=1;
        L+=1;
        while( L<=n){
            int area= arr[L]*arr[R];
            if(area<B && L==R){
                ans=ans+1;
            }else if(area<B && L !=R){
                ans=ans+2;
            }
            L++;
        }
        return ans;
    }
    public static void main(String args[]){
        int[] arr={1,2};
        int B=5;
        //System.out.println(arr.length);
         System.out.println(getmaxSize(arr,B));
    }
}
