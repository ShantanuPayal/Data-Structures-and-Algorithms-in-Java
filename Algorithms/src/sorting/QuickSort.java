package sorting;

import java.util.Scanner;

public class QuickSort {

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " << ");
        }
    }
    
    void quicsort(int a[],int start,int end)
    {
        int i=start,j=end,pivot=end;
        if(i<=j)
        {
            while(i<j)
            {
                while(a[i]<a[pivot])
                    i++;
                while(a[j]>a[pivot])
                    j--;
                if(i<j)
                {
                    int temp=a[i];a[i]=a[j];a[j]=temp;}
                }
            }
        if(i<end)
            quicsort(a,i+1,end);
        if(j>start)
            quicsort(a,start,j-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {66, 11, 44, 33, 77, 55, 88, 99, 22};

        QuickSort s = new QuickSort();
        s.print(arr);
     
        System.out.println();
        s.quicsort(arr, 0, arr.length-1);
        System.out.println("After Sorting");
        s.print(arr);
    }
}
