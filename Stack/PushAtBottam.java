package DSA2.Stack;
import java.util.*;
public class PushAtBottam {
    public static void PushAtBottam(Stack<Integer> s ,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        PushAtBottam(s, data);
        s.push(top);
    }
    public static void main(String args []){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        PushAtBottam(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
