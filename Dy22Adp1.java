// Day 22 Additional Problem1

import java.util.ArrayList;

public class Dy22Adp1 {

    public static void main(String args[]){
        ArrayList<Integer> A= new ArrayList<>();
        for(int i=1;i<6;i++){
            A.add(i);
        }
        int B=4;
        solve(A,B);
    }
    public static void solve(ArrayList<Integer> A, int B){
        int n=A.size();
        int SubarrayCount=0;
        for(int i=0;i<n;i++){
            int subarraySum=0;
            int elementCount=0;
            for(int j=i;j<n;j++){
                subarraySum+=A.get(j);
                elementCount+=1;
                if(elementCount%2==0 && subarraySum<B ){
                    SubarrayCount++;
                }
                else if(elementCount % 2 == 1 && subarraySum > B ){
                    SubarrayCount++;
                }
            }
        }
        System.out.println(SubarrayCount);
    }
}