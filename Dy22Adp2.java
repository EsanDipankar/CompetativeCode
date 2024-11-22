//day 22  Additional Problem 2
import java.util.ArrayList;
public class Dy22Adp2 {
    public static void main(String args[]){
        ArrayList<Integer> A= new ArrayList<>();
        for(int i=1;i<7;i++){
            A.add(i);
        }

        System.out.println(A);
        int B=4;
        solve(A, B);
    
    }
    public static void solve(ArrayList<Integer> A, int B){
        int n=A.size();
        int sum=0;
        int ans= Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<B;i++){
            sum+=A.get(i);
        }
        if(sum<ans){
            ans=sum;
            index=0;
        }
   
        int s=1;
        int e=B;
        while(s<=n-B && e<n ){
            sum+=A.get(e);
            sum+=A.get(s);
            if(sum<ans){
                ans=sum;
                index=s;
            }
            s++;
            e++;
        }
      
        System.out.println(index);
        
    }
}
