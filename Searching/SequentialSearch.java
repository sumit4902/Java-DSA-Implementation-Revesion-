package Searching;

public class SequentialSearch {
    public static void main(String[] args) {
        
        int [] arr = {2,3,5,2,4,6,7,4};
        int key=3;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Element found at index : "+ i);
                return;
            }

        }
        System.out.println("Element Not Found");
    }
}
