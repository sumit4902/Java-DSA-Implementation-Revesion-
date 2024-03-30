package Searching;

public class BinarySearch {

    // Without Recursion 
    public static void Searching(int [] arr,int key )
    {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
           
            int mid = (l + r ) / 2;   // point where mostly stuck in this
            if(arr[mid]==key)
            {
                System.out.println("Element Found At index : "+mid);
                return;
            }
            else if(arr[mid]<key)
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println("Element Not Found ");
        return;
    }

    //  Using Recursion 
     static void BinarySearching(int [] arr,int l,int r,int key)
    {
        
       if(l>r)  // Base Condition //
      {
        System.out.println(" Element Not found");
        return;
      }
        
       int mid = (l+r)/2;
       if(arr[mid]==key)
       {
        System.out.println("Element Found Successfully at index : "+mid);
        return ;
       }
       else if (arr[mid]>key)
       {
        BinarySearching(arr, l, mid-1, key);
       }
       else{
        BinarySearching(arr, mid+1, r, key);
       }

       
        
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,7,9,22,55,88};  // ensure that it sorted array

      //  BinarySearching(arr, 0, arr.length-1, 0);
        Searching(arr, 88);
        }
}
