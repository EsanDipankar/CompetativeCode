import java.util.Stack;

public class ValidBracket {
    public static boolean isValid(String s){
        Stack<Character> stak = new Stack<>();
        for(char it:s.toCharArray()){
            if(it =='(' || it =='{' || it =='[' ){
                stak.push(it);
            }
            else{
                if(stak.isEmpty()) return false;
                char t=stak.pop();
                if((it==')' && t=='(') || (it=='}' && t=='{') || (it==']' && t=='[')){
                    continue;
                }else{
                    return false;
                }
            }

        }
        if(stak.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public static void main (String[] args) {
		
		String s=")([{}()]";
		if(isValid(s)==true)
		System.out.println("True");
		else
		System.out.println("False");
	}
}
