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
        int pivot = input.nextInt();
        StringBuilder greater = new StringBuilder("");
        for(int i = 1; i < n; i++){
            int num = input.nextInt();
            if(num < pivot)
            {
                System.out.print(num+" ");
                continue;
            }
            else
                greater.append(num+" ");
                
        }
        System.out.print(pivot+" "+greater.toString());        
    }
}