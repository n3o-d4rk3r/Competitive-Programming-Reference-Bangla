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
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = input.nextInt();
        
        Arrays.sort(array);
        int minAbs = Integer.MAX_VALUE; //Minimum absolute difference
        StringBuilder pairs = new StringBuilder("");
        
        for(int i = 0; i < n-1; i++)
        {
            int absDiff;
            
            if((array[i]<0 && array[i+1]<0)||(array[i]>0 && array[i+1]>0))//both numbers have matching signs
                absDiff = Math.abs(array[i] - array[i+1]); //Absolute difference
            else
                absDiff = Math.abs(array[i]) + Math.abs(array[i+1]); //Absolute difference
            
            if(absDiff < minAbs)//New minAbs
            {
                minAbs = absDiff;
                pairs = new StringBuilder("");//Empty pairs
                pairs.append(array[i]+ " " +array[i+1]+" ");//Add pair
            }
            else if(absDiff == minAbs)//Multiple minAbs
                pairs.append(array[i]+ " " +array[i+1]+" ");//Add pair
        }
        
        System.out.println(pairs);
    }
}