import java.util.*;
public class AllDiagonal2Dmatrix {
    public static void main(String args[]){
     int arr[][] = new int[3][3];
     int counter=1;     
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr[i][j]=counter;
            counter++;
        }
     }
    //  for (int i = 0; i < 3; i++) {
    //     for (int j = 0; j < 3; j++) {
    //         System.out.print(arr[i][j] + " ");
    //     }
    //     System.out.println();  // Move to the next line after each row
    // }
    // int i=0;
   
    
     
        for(int i=0;i<3;i++){ // traversing over the col
            int row=0; 
            int col=i;
            while(row<3 && col<3){
                System.out.print(arr[row][col]);
                row++;
                col++;
            }
            System.out.println();
        }
        for(int j=2;j>0;j--){  // Traverse over row
            int r=j;
            int c=0;
            while(c<2 && r<2){
                System.out.print(arr[r][c]);
                r++;
                c++;
            }
            System.out.println();
        }



    }
}