package Linkedlist;


class linkedlist{

 
   class Node{
    int data;
    Node next;
   
  Node(int data)
  {
    this.data= data;
    this.next=null;
  }
}

Node head=null;
Node temp=null;

void insertionlast(int data)
{
  Node newnode = new Node(data);
  if(head==null)
  {
    head=temp=newnode;
  }
  else{
    temp.next=newnode;
    temp=temp.next;
  }

}


  void insertAtPosition(int data , int position)
  {
    Node newnode= new Node(data);

    temp=head;
    for(int i=1;i<position-1&&temp.next!=null;i++)
    {
      temp=temp.next;
    }
    newnode.next=temp.next;
    temp.next=newnode;
    temp=temp.next;

  }
  
void deletionlast()
{
    if(head==null)
    {
        System.out.println("List is Empty");
        return;
    }
     temp=head;
     if(temp.next==null)
     {
        head=temp=null;
     }
     while(temp.next.next!=null)
     {
           temp=temp.next;
     }
     temp.next=null;
}
void deleteAtposition(int position)
{
  temp=head;
  for(int i=1;i<position-1&&temp.next!=null;i++)
  {
     temp=temp.next;
  }
   temp.next=temp.next.next;
}

void insertionfirst(  int data)
{
Node newnode = new Node(data);

if(head==null)
{
    head=newnode;
}
else{
   newnode.next=head;
   head=newnode; 
}
}


void deletionfirst(){
   
    if(head==null)
    {
        System.out.println("List is empty");
    }
    else{
        head= head.next;
    }

}
   void reverse()
   {
     Node prev = null;
     Node current = null;
     Node next = null;
      current=next=head;
      while(current!=null)
      {
        next=next.next;
        current.next=prev;
        prev=current;
        current=next;
      }
      head=prev;
     
   }


 void print()
 {
    temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println();
 }
}


public class Singlylinkedlist {
    public static void main(String[] args) {
        
        linkedlist  list = new linkedlist();
        list.insertionlast(1);
        list.insertionlast(2);
        list.insertionlast(3);
        list.print();
        list.deletionlast();
        list.print();
        list.insertionfirst(22);
        list.print();
        list.deletionfirst();
        list.print();
      //  list.reverse();
      list.insertAtPosition(12121212, 1);
      list.print();
      list.deleteAtposition(2);
        list.print();
        

    }
}
