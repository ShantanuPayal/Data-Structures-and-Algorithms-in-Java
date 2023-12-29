package sorting;

import java.util.Scanner;

public class MergeSort {
	void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " << ");
        }
    }
    
   void mergesort(int arr[], int start,  int end)
   {
	   
	   if(start<end)
       {
           int mid=(start+end)/2;
           mergesort(arr,start,mid);//div
           mergesort(arr,mid+1,end);//div
           merger(arr,start,mid,end);//conquer
       }
   }
   void merger(int arr[], int start, int mid, int end) {
	    int temp[] = new int[arr.length];
	    int i = start; // Pointer for the left subarray
	    int j = mid + 1; // Pointer for the right subarray
	    int tindex = start; // Pointer for the temporary array

	    while (i <= mid && j <= end) {
	        if (arr[i] <= arr[j]) {
	            temp[tindex] = arr[i];
	            i++;
	        } else {
	            temp[tindex] = arr[j];
	            j++;
	        }
	        tindex++;
	    }

	    // Copy remaining elements from the left subarray (if any)
	    while (i <= mid) {
	        temp[tindex] = arr[i];
	        i++;
	        tindex++;
	    }

	    // Copy remaining elements from the right subarray (if any)
	    while (j <= end) {
	        temp[tindex] = arr[j];
	        j++;
	        tindex++;
	    }

	    // Copy the sorted elements back to the original array
	    for (int k = start; k < tindex; k++) {
	        arr[k] = temp[k];
	    }
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {66, 11, 44, 33, 77, 55, 88, 99};

        MergeSort s = new MergeSort();
        s.print(arr);
     
        System.out.println();
        s.mergesort(arr, 0, arr.length);
        System.out.println("After Sorting");
        s.print(arr);
    }
}
