package QueueDatastructure;

  class Queuedsa {

        int [] q;
        int front;
        int rear;
        Queuedsa(int size)
        {
           q=new int[size];
           front=-1;
           rear=-1;
        } 
   
         int size()
         {
           return q.length-1;
         }
        int peek()
        {
           return q[rear];
        }
   
        void enqueue( int data)
        {
           if(rear==size())
           {
               System.out.println("Queue is full");
           } 
   
           if(front==-1)
           {
               front=rear=0;
           }
           else{
               rear++;
           }
            q[rear]=data;
        }
   
         void dequeue()
         {
           if(front==-1)
           {
               System.out.println("queue is empty");
   
           }
           if(front==rear)
           {
               front=rear=-1;
           }
           else{
               front++;
           }
   
         }
         void print()
         {
           for(int i=front;i<=rear;i++)
          {
           System.out.println(q[i]);
          }
         }
   }
   
   public class queue {
   public static void main(String[] args) {
        
     
    Queuedsa que = new Queuedsa(5);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.print();
        que.dequeue();
        System.out.println("After dequeue Operation result will be");
        que.print();
        System.out.println(que.peek());
 
 
     }
    }
