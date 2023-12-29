package sorting;
import java.util.Scanner;

public class SelectionSort {
	 void print(int arr[]) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " << ");
	        }
	  }
	 /*
	void  selectionsort(int arr[]) {
		    for (int i = 0; i < arr.length - 1; i++) {
		        int minIndex = i;
		        // Find the index of the minimum element in the unsorted part of the array
		        for (int j = i + 1; j < arr.length; j++) {
		            if (arr[j] < arr[minIndex]) {
		                minIndex = j;
		            }
		        }
		        // Swap the found minimum element with the current element
		        int temp = arr[minIndex];
		        arr[minIndex] = arr[i];
		        arr[i] = temp;
		    }
		  
		}
	*/
	 void selectionsort(int arr[])
	 {
		 for (int i=0;i<arr.length-1;i++)
		 {
			 int min=i;
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[j]<arr[min])
					 min=j;
			 }
			 int temp=arr[min];
			 arr[min]=arr[i];
			 arr[i]=temp;
		 }
	 }
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int arr[] = {66, 11, 44, 33, 77, 55, 88, 99, 22};

	        SelectionSort s = new SelectionSort();
	        s.print(arr);
	     
	        System.out.println();
	        s.selectionsort(arr);
	        System.out.println("After Sorting");
	        s.print(arr);
	}
}
