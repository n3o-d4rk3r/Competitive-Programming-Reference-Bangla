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
        
        int leftDiagonal = input.nextInt();
        int rightDiagonal = 0;
        
        for(int i = 1; i<n*n; i++)
        {
            int value = input.nextInt();
            if(i%(n+1) == 0)
            {

                leftDiagonal += value;
            }
            if(i%(n-1) == 0 && i != (n*n)-1)
            {
                rightDiagonal += value;
            }
        }
        System.out.println(Math.abs(leftDiagonal-rightDiagonal));
        
        
    }
}