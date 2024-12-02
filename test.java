import java.util.*;
public class test{
    public static void main(String args[]){
        //taking an list of 10integer
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<6;i++){
            arr.add(i);
        }
        for(int i=2;i<8;i++){
            arr.add(i);
        }
        for(int i=4;i<9;i++){
            arr.add(i);
        }
        System.out.println(arr);// printing th e size of the set
        // Setoperation(arr);
        HasMapOpertaion(arr);
        getfrequency(arr);
    }
    public static void Setoperation(ArrayList<Integer> A){
        HashSet<Integer> HSet= new HashSet<Integer>();
        for(int i=0;i<A.size();i++){
            HSet.add(A.get(i));
        }
        System.out.println(HSet.size());// printing th e size of the set
        int n=HSet.size();
        int s;
        for(Integer it:HSet){  // Iterate over the HashSet and printing only the data is even
            // if(it%2==0)System.out.print(it); else continue;
            int M=it % 2 == 0 ? it : 0;
            // System.out.println(M);

        }
        // print the maximum element in the hashSet
        int maxi=0;
        for(Integer hs: HSet){
            maxi=maxi>hs?maxi:hs;
        }
        System.out.println("Maximum Element of the Set is:- "+ maxi);
        System.out.println();
        //  Find the Minimum element of the HashSet
        int mini= 99999;
        for(Integer hs:HSet){
            mini= mini<hs? mini:hs;
        }
        System.out.print("Minimum element of the HashSet is:- "+mini);
        
    }
    public static void HasMapOpertaion(ArrayList<Integer> A){
        // Checking frequency
        HashMap<Integer, Integer>  HM= new HashMap<Integer, Integer>();
        
        // for(int i=0;i<A.size();i++){
        //     // HM(A.get(i));
        //     HM.put(A.get(i), HM.get(A.get(i))==null? 1: HM.get(A.get(i))+1);
        // }
        // System.out.println(HM);
    }
    public static void getfrequency(ArrayList<Integer> A){
        HashMap<Integer, Integer>  HM= new HashMap<Integer, Integer>();
        for(int i=0;i<A.size();i++){
            if(HM.containsKey(A.get(i))){
                int value=HM.get(A.get(i))+1;
                int key=A.get(i);
                HM.put(key,value);
            }else{
                HM.put(A.get(i),1);
            }
        }
        System.out.println(HM);
        
    }
}