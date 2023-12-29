package search;

import java.util.Scanner;

/*
public class SequentialSearch {
    public static void main(String[] args) {
        int arr[] = {22, 11, 55, 77, 33, 99, 45, 67, 44, 100};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key to find:");
        int key = sc.nextInt();

        int index = linearSearch(arr, key);

        if (index != -1) {
            System.out.println(key + " is present at index: " + index);
        } else {
            System.out.println(key + " is not present in the array");
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Element found, return index
            }
        }
        return -1; // Element not found
    }
}
*/
public class SequentialSearch{
	public static int LinearSearch(int arr[], int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entere no of elements in array");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println( " enter element :");
			arr[i]=sc.nextInt();
		}
		System.out.println("Eneter eleemntto be searched:");
		int key=sc.nextInt();
		int index=LinearSearch(arr,key);
		if(index !=-1)
			System.out.println(key +" element found ata index "+index);
		else
			System.out.println(key +" element not found ata index ");
	}		
}