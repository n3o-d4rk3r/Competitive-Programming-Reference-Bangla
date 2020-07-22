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
        
        StringBuilder stair = new StringBuilder("");
        
        for(int i = 0; i < n; i++)
        {
            stair.append(" ");
        }
        
        for(int i = 1; i< n+1; i++)
        {
            stair.setCharAt(n-i,'#');
            System.out.println(stair);
        }
    }
}