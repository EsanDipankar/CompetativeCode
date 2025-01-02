public class MinimumSwap {
    public static void main(String args[]){
        int arr[]={5,17,100,11};
        int b=20;
        int start=0;
        int end=arr.length-1;
        int count=0;
        while(start<=end){
            if(arr[start]<=b){
                start++;
            }
            else if(arr[end]>b){
                end--;
            }
            else{
                count++;
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        System.out.println(count);
    }
}
