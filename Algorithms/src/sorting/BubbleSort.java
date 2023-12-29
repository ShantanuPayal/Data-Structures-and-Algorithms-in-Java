package sorting;

import java.util.Scanner;

public class BubbleSort {

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " << ");
        }
    }

    int[] bubblesort(int arr[]) {
     
        for (int i = 0; i<arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    
    
    //Tyis version is much efficient compared to above code as we know after every pass last element will be sorted
    //inorder to reduce the overhead of reaching till last and repeating the logic on already sorted elements at last
    //we subtract the sorted element which is at last with every pass
    int[] bubblesortV2(int arr[]) {
        
        for (int i = 0; i<arr.length - 1; i++) {
            for (int j = 0; j < (arr.length-1-i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    
    //What if complete array is already sortted??
    //with count
  int[] bubblesortV3_1(int arr[]) {
        int count=0;
        
        for (int i = 0; i<arr.length - 1; i++) {
        	while(count<=1)
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    break;
                }
            }
        
        		return arr;
            
            	
        }
        return arr;
    }
  //with flag
  int[] bubblesortV3_2(int arr[]) {
	    boolean isSorted = true;

	    for (int i = 0; i < arr.length - 1; i++) {
	        isSorted = true;
	        for (int j = 0; j < arr.length - 1 - i; j++) {
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	                isSorted = false; // Array was not fully sorted in this pass
	            }
	        }
	        if (isSorted) {
	            // If array is sorted, no need for further iterations
	            break;
	        }
	    }
	    return arr;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {66, 11, 44, 33, 77, 55, 88, 99, 22};

        BubbleSort s = new BubbleSort();
        s.print(arr);
     
        System.out.println();
        int sortedArray[] = s.bubblesort(arr);
        System.out.println("After Sorting");
        s.print(sortedArray);
    }
}
