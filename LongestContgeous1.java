import java.util.*;
public class LongestContgeous1 {
    public static ArrayList<Integer> longCont1(ArrayList<Integer> arr, int B){
        int l=0;
        int n=arr.size()-1;
        int cntZero=0;
        int ansL=0, ansR=0, len=0;
        int maxlen=Integer.MIN_VALUE;
        ArrayList<Integer>ans= new ArrayList<Integer>();
        for(int i=0;i<=n;i++){
            if(arr.get(i)==0){
                cntZero++;
                while(cntZero>B){
                    if(arr.get(l)==0){
                        cntZero--;
                    }
                    l++;
                }
            }
            len=(i-l)+1;
            if(maxlen<len){
                ansL=l;
                ansR=i;
                maxlen=len;
            }
        }
        System.out.print(ansL +"<-->"+ ansR);
        while(ansL <= ansR){
            ans.add(ansL);
            ansL++;
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 1, 1, 0, 1, 0, 1, 1, 1));
        int B = 2; // Number of 0s allowed to flip

        ArrayList<Integer> indices = longCont1(arr, B);
        
    }
    
}