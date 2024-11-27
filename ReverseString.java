public class ReverseString {
    public static void main(String args[]){
        // String S= "Hello";
        // ReverseStringbyChar(S);
        // System.out.println(S);
        String sentence="Hello world    ";
        reversebyword(sentence);
    }

    public static void ReverseStringbyChar(String S){  // Reversing string 
        char ars[]=S.toCharArray();
        int e= ars.length-1;
        int s=0;
        while(s<e){
           char temp=ars[s];
           ars[s]=ars[e];
           ars[e]=temp;
           s++;
           e--; 
        }
        System.out.print(ars); // Here I am printing and character array
    }
    // Reverse string by word
    public static void reversebyword(String str){
        char arrs[]= str.toCharArray();
        // int s=0; 
        int e=str.length()-1;
        String ans="";
        int s=e;
        for(int i=e;i>=0;i--){
            while(e>0 && arrs[e]==' '){
                e--;
            }
            while(s>=0 && arrs[s]!=' '){
                s--;
            }
            // str.substring(s+1, e);
            System.out.println( s+"-->"+e);
            // ans=str.substring(s+1, e+1)+" "+ ans;
            // i=s;
            // e=i;          
        }
       
        // ans=ans+ str.substring(s, e)+" "; 
        System.out.println(ans);
    } 
}
