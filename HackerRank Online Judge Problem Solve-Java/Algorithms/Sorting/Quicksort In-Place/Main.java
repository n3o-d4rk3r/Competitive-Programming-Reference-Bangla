import java.io.*;
import java.util.*;


/* 
* =====================
* => D Y N A M I T E <=
* =====================
*  The Dynamite Group
* By,
* N3o D4rk3r
* https://github.com/n3o-d4rk3r
*======================
* Java 8
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            ar[i] = input.nextInt();
        }
        quicksort(ar,0,ar.length-1);
    }
    
    static void quicksort(int[] array, int beg, int end)
    {
        if(beg >= end) return;
        
        int pivot = array[end];
        int wall = beg;
        
        //Partition with a wall
        for(int i = beg; i < end; i++)
        {
            if(array[i] < pivot)
            {
                swap(array, i, wall);
                wall++;
            }
        }
        
        //Place pivot
        swap(array, end, wall);
        
        //Print after partition
        printArray(array);
        
        //Sort left of partition
        quicksort(array, beg, wall-1);
        
        //Sort right of partition
        quicksort(array, wall+1, end);        
    }
    
    
    static void swap(int[] array, int index1, int index2)
    {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    static void printArray(int[] array)
    {
        for(int num : array)
        {
            System.out.print(num+" ");
        }
        System.out.println("");
    }
}