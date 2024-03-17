package Stackdatastructure;

class Stackdsa{
    int st[];
    int top;
    int size;
    Stackdsa(int size)
    { 
        this.size=size;
        st = new int[size];
        top=-1;
    }

    void push( int data)
    {
        if(top==size())
        {
            System.out.println("stack is full");
        }
        st[++top]=data;
    }
    void pop()
    {
         if(top==-1)
         {
            System.out.println("stack is  empty");
         }
         st[top--]=0;
         
    }
    int  peek()
    {
          return st[top];
    }
    int size()
    {
       return st.length-1;
    }

    void print()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(st[i]);
        }
    }
}

public class stack {
    
    public static void main(String[] args) {
        Stackdsa  stck = new Stackdsa(5);
        stck.push(2);
        stck.push(5);
        stck.push(10);
        stck.push(19);
        stck.print();
        stck.pop();
        System.out.println("After pop operation");
        stck.print();
    }

   
        

}
