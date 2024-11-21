import java.util.*;
public class Anagram {
    public static void main(String args[]){
        String A="service";
        String B="request";
        char[] arr= A.toCharArray();
        char[] Brr= B.toCharArray();
        int[] mainArr= new int[26];
        
        for(int i=0;i<A.length();i++){
            mainArr[arr[i]-'a']++;
        }
        for(int i=0;i<B.length();i++){
                mainArr[Brr[i]-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (mainArr[i] != 0) {
                System.out.println((char) (i + 'a') + " --> " + mainArr[i]);
            }
        }

      

    }
}
