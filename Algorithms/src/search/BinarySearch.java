package search;
import java.util.Arrays;
import java.util.Scanner;
/*
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66,77,88,99};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key to find:");
        int key = sc.nextInt();
        int index = binarySearch(arr, key, 0, arr.length-1);
        if (index != -1) {
            System.out.println(key + " is present at index: " + index);
        } else {
            System.out.println(key + " is not present in the array");
        }
    }
    public static int binarySearch(int[] arr, int key, int start, int end) {
    	
    	if(key<arr[start] || key>arr[end])
    		return -1;
    	//above lines improves the efficeincy by not entering the actual working and 
    	//returning not found if element to be search is not between start or end
    	else if(start<=end)
    	{
	    	  int mid=(start+end)/2;
	    	 if(key==arr[mid])
	    		 return mid;
	    	 else
	    	 {   		
	    		 if(key<arr[mid])
	    			 return binarySearch(arr,key,start,mid-1);
	    		 else
	    			 return binarySearch(arr,key,mid+1,end);  			 
	    	 }   		  
    	}
        else
    	  return -1;
    }
}
*/

public class BinarySearch
{
	public static int binarysearch(int arr[], int key, int start, int end)
	{
		if(key<arr[start]|| key>arr[end])
			return -1;
		else if(start<=end)
		{
			int mid=(start+end)/2;
			
			if(key==arr[mid])
				return mid;
			else
			{
				if(key<arr[mid])
					return binarysearch(arr,key,start, mid-1);
				else
					return binarysearch(arr,key,mid+1, end);
			}
		}
		else
			return -1;
	}
	public static void main(String[] args) {
		 int arr[] = {11,22,33,44,55,66,77,88,99};
	        Arrays.sort(arr);
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter key to find:");
	        int key = sc.nextInt();
	        int index= binarysearch(arr,key,0,arr.length-1);
	        if(index!=-1)
	        {
	        	System.out.println(key + " is present at index: " + index);
	        } else {
	            System.out.println(key + " is not present in the array");
	        }
	        	
	}
	
}


