package DSA2.Queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static  Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){   //o(n)
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){  // O(1)
            if(isEmpty()){
                System.out.println("queue is empty ");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){   //O(1)
            if(isEmpty()){
                System.out.println("queue is empty ");
                return -1;
            }
            return s1.peek();
        }
    }
    static class queue1{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty ");
                return -1;
            }else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
                return s1.pop();
            }
        }
        public static void add(int data){
            s1.push(data);
        }
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        queue q1 = new queue();
            q1.add(1);
            q1.add(2);
            q1.add(3);

            while(!q1.isEmpty()){
                System.out.println(q1.peek());
                q1.remove();
            }
    }
}
