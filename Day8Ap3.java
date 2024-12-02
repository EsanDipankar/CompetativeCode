import java.util.*;
public class Day8Ap3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n; i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print("0");
            }
            int count;
            for(int k=n-i; k<=n+i;k++){
                System.out.print(k);
            }
            for(int j=0;j<n-1-i;j++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
    
}
