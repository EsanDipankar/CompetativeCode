import java.util.*;
public class t {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 11},
            {4, 5, 6, 22},
            {7, 8, 9, 33}
        };
        int sr= 0;
        int er= array.length -1;
        int sc= 0;
        int ec= array.length-1;
        while(sr<=er && sc<= ec){
           printBoundary(array, sr, er, sc, ec); 
           sr++;
           er--;
           sc++;
           ec--;
        }
        
    }
    public static void printBoundary(int [][] array, int sr, int er, int sc, int ec){
        if(sr==er){
            for(int i=sc; i<=ec; i++){ //  Printing   
                System.out.print(array[sr][i]);
            }
            return;
        }
        if(sc==ec){
            for(int j=sr+1; j<=er;j++ ){
                System.out.print(array[j][ec]);
            }
            return;
        }
        for(int i=sc; i<=ec; i++){ //  Printing   
            System.out.print(array[sr][i]);
        }
        System.out.println();
        for(int j=sr+1; j<=er;j++ ){
            System.out.print(array[j][ec]);
        }
        System.out.println();
        for(int k=ec-1;k>=sc;k--){
            System.out.print(array[er][k]);
        }
        System.out.println();
        for(int k=ec-1;k>sr;k--){
            System.out.print(array[k][sr]);
        }
    }
}