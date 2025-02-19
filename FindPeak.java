import java.util.*;


public class FindPeak{
    public static int findPeekElement(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=0;
        
        while(start <= end){
            int mid= (start + end)/2;
            int prev= (mid==0)? Integer.MIN_VALUE: arr[mid - 1];
            int next= (mid==n-1)? Integer.MIN_VALUE: arr[mid +1];
            if(arr[mid]>prev && arr[mid]>next){
                ans=arr[mid];
                return ans;
            }else if(prev>arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,100,5,4};
        int n= findPeekElement(arr);
        System.out.println(n);
              
    }
}