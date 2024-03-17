package QueueDatastructure;

    
 class Queueds{
   
    int [] q;
    int front;
    int rear;                                                     

    Queueds(int size)                                             
    {                                                            
        q = new int[size];                                      
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

    void insertfirst( int data)
    {
       if(rear==size()-1)
       {
        System.out.println("queue is full");
        return;
       }
       if(front==-1)
       {
        front--;
        rear--;
       }
       else{
        front--;
       }
       q[front]= data;

    }

   public void  insertlast( int data )
    {
       
        if(rear==size())
        {
            System.out.println("queue is full");
            return;
        }
        if(front==-1)
        {
            front++;
            rear++;
        }
  else{
            rear++;
           
        }
        q[rear]=data;
    }

   public  void print()
    {
        if(rear==-1)
        {
            System.out.println("queue is Full");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.println(q[i]);
        }
        
        
    }

}

public class DoublEndedQueue {

    public static void main(String[] args) {
    
        Queueds dsa =new Queueds(5);
     dsa.insertfirst(2);
     dsa.insertfirst(10);
     dsa.print();

    }
}


















