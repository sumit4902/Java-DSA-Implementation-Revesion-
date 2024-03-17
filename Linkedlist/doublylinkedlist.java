package Linkedlist;



class Dblist{

class Node{

         Node prev;
         int data;
         Node next;

         Node(int data)
         {
            this.data=data;
            prev=null;
            next=null;
         }

}
        Node head=null;
        Node tail=null;
        Node temp=null;

    void insertion(int data)
    {
       Node newnode = new Node(data); // |2|null| 

          if(head==null)
          {
              head=temp=newnode;
          }
          else{
            temp.next=newnode;
            newnode.prev=temp;
            temp=temp.next;
          }
          tail=newnode;
    }
        
          void deletion()
          {
            temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            tail=temp.prev;
            temp.prev.next=null;
            temp.next=null;
           
            temp.prev=null;

           // tail=tail.prev;     
           // tail.next=null;     
          }


           void reverselogic()
           {
              temp=head;
              Node Temperory=null;
              while(temp!=null)
              {
                Temperory= temp.next;
                temp.next=temp.prev;
                temp.prev=Temperory;
                temp=temp.prev;
              }
              Temperory=tail;
              tail=head;
              head=Temperory;
           }



        void forwardPrint()
        {
            temp=head;
            while(temp!=null)
            {
             System.out.print(temp.data+"->");
             temp=temp.next;
            }
        }
        void reversePrint()
        {
            temp=tail;
            while(temp!=null)
            {
             System.out.print(temp.data+"->");
             temp=temp.prev;
            }
        }
}


public class doublylinkedlist {
    
   public static void main(String[] args) {
      
       Dblist list = new Dblist();
       list.insertion(11);
       list.insertion(22);
       list.insertion(33);
       list.forwardPrint();
       System.out.println();
       list.deletion();
       list.forwardPrint();
       System.out.println();
       list.reverselogic();
       list.forwardPrint();
       System.out.println();
       list.reversePrint();

   }
}
