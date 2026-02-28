package DSA2.Stack;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean Duplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch==')'){
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch); //opeining 
            }
        }
        return false;
    }
    public static void main(String args[]){
         String str = "((a)+(b))";
         String str2 = "(((a)+(b)))";
         System.out.println(Duplicate(str));
         System.out.println(Duplicate(str2));
    }
}
