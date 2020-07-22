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
        int V = input.nextInt();
        int n = input.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            if(input.nextInt() == V)
            {
                System.out.println(i);
                System.exit(0);
            }
        }
    }
}