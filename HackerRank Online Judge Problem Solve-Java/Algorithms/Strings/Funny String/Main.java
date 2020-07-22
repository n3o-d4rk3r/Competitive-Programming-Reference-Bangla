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
        int T = input.nextInt();
        input.nextLine();
        
        tests:
        for(int i = 0; i < T; i++)
        {
            String s = input.nextLine();
            for(int j = 1; j < (s.length()/2)+1; j++)
            {
                int left = Math.abs(s.charAt(j) - s.charAt(j-1));
                int right = Math.abs(s.charAt(s.length()-1-j) - s.charAt(s.length()-j));
                if( left != right)
                {
                    System.out.println("Not Funny");
                    continue tests;
                }
            }
            System.out.println("Funny");
        }
    }
}