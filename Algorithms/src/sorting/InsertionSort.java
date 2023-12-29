package sorting;

import java.util.Scanner;

public class InsertionSort {
	 void print(int arr[]) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " << ");
	        }
	  }
	 int[] insertionsort(int arr[]) {
		    // Traverse through the array starting from the second element
		    for (int i = 1; i < arr.length; i++) {
		        // Store the current element to be inserted at its correct position
		        int newElement = arr[i];
		        int j = i;

		        // Compare the new element with the elements before it and shift elements to the right
		        // to make space for the new element in its correct sorted position
		        while (j > 0 && arr[j - 1] > newElement) {
		            arr[j] = arr[j - 1];
		            j--;
		        }

		        // Place the new element in its correct sorted position
		        arr[j] = newElement;
		    }

		    return arr;
		}


	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int arr[] = {66, 11, 44, 33, 77, 55, 88, 99, 22};

	        InsertionSort s = new InsertionSort();
	        s.print(arr);
	     
	        System.out.println();
	        int sortedArray[] = s.insertionsort(arr);
	        System.out.println("After Sorting");
	        s.print(sortedArray);
	}
}
