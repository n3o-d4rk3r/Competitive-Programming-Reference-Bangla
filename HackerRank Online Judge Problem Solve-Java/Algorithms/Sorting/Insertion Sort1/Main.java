import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


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
    
    

    public static void insertIntoSorted(int[] ar) {
        int tmp = ar[ar.length-1];
        for(int i = ar.length-2; i  >=0; i--){
            if(tmp >= ar[i]){//Found where it goes
                ar[i+1] = tmp;
                printArray(ar);
                break;
            }
            ar[i+1] = ar[i];//Shift to the right
            printArray(ar);
        }
        if(tmp < ar[0]){
          ar[0] = tmp;  
          printArray(ar);
        } 
        
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
