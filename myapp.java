import java.util.*;

class myapp{
    public static void main(String[] args){
        int[] arr={1,1,3,3,5,5,4,2,2,6,6};
        int x= arr.length;
        System.out.println(x);
        int target=4;
        int n= Binarysearch(arr, target);
        System.out.println("Result" + n);
    }
    public static int Binarysearch(int [] arr, int k){
        int start=0;
        int end=arr.length -1;
        int ans= -1;
        while(start<= end){
            int mid= (start + end)/2;
            if(arr[mid]== k){
                ans= mid;
                return ans;
            }
            else if(mid%2==0 && arr[mid]==arr[mid+1]){
                start=mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return ans;
    }
}
