package DSA2.Queue;

public class QueueLinkedList {
    static class node{
        node next;
        int data;
        node(int data){
            this.data = data ;
            this.next = null ;
        }

    }
    static class Queue{
        static node head = null;
        static node tail = null ;


        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        // public static boolean fullQueue(){
        //     return (rear+1) % size ==front ;
        // }
        //add
        public static void add(int data){
            node newnode = new node(data);
            if(head==null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode ;
            tail = newnode ;
        }
        // Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println(" Queue is empty");
                return -1;
            }
            int result = head.data;
            if(head ==tail){         //single element 
                head = tail=null ;
            }else{
                head = head.next ;
            }
             return result;
        }
        //peek 
        public static int peek(){
            if(isEmpty()){
                System.out.println(" Queue is empty");
                return -1;
            }
            return head.data;
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
     
}




