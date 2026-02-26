package DSA2.Stack;
import java.util.*;
public class ReverseStack {
    public static void PushAtBottam(Stack<Integer> s ,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        PushAtBottam(s, data);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        PushAtBottam(s, top);
    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
     public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        print(s);

     }
}