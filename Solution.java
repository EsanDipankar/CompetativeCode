import java.util.*;
public class Solution{
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(0);
        A.add(1);
        A.add(3);
        // A.add(0);
        int ans=solve(A);
        System.out.println("Ans is:- "+ans);
    }
	public static int solve(ArrayList<Integer> A){
		int n=A.size();
		int ind=A.get(0);
		int count=0;
		for(int i=0;i<n;i++){
			ind=Math.max(ind,A.get(i) );
			if(i==ind){
				count++;
                System.out.println(i);
			}
		}
		return count;
	}
}