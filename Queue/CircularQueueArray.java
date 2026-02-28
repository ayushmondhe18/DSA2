package DSA2.Queue;

public class CircularQueueArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n ;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean fullQueue(){
            return (rear+1) % size ==front ;
        }
        //add
        public static void add(int data){
            if(fullQueue()){
                System.out.println("Queue is full");
            }
            //ading first element
            if(front == -1){
                front = 0 ;
            }
            rear =(rear + 1) % size;
            arr[rear] = data ; 
        }
        // Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println(" Queue is empty");
                return -1;
            }
            //last element delete
            int result = arr[front];
            if(front == rear){
                front = rear = -1 ;
            }else{
                front = (front + 1) % size ;
            }
             return front ;
        }
        //peek 
        public static int peek(){
            if(isEmpty()){
                System.out.println(" Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public static void main(String[] args) {
            Queue q = new Queue(5);
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


