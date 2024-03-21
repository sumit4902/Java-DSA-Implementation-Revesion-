package Linkedlist;


class Circularlink{

    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data= data;
            next=null;
        }
    }

    Node tail=null;
    Node temp=null;

    void insertion(int data)
    {
       Node newnode = new Node(data);
       if(tail==null)
       {
        tail=newnode;
        tail.next=newnode;
       }
       else{
          newnode.next=tail.next;
          tail.next=newnode;
          tail=tail.next;
       }
    }

    void deletion()
    {
        temp=tail;
        temp=temp.next;
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        temp.next=tail.next;
        
         tail=temp;
    }

    void print()
    {
        temp=tail;
        temp=temp.next;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        while(temp!=tail.next);
       
    }
}

public class CircularLinkedlist {
    
    public static void main(String[] args) {
        
        Circularlink list = new Circularlink();
        list.insertion(11);
        list.insertion(22);
        list.insertion(23);
        list.print();
        System.out.println();
        list.deletion();
        System.out.println(list.tail.data);
        list.print();
       
       
    }
}
