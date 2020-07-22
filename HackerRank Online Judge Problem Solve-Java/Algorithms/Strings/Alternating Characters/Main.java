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
        for(int t = 0; t < T; t++)
        {
            String s = input.nextLine();
            int deletions = 0;
            int currentCount = 1;
            for(int i = 1; i < s.length(); i++)
            {
                if(s.charAt(i) != s.charAt(i-1))
                {
                    deletions += currentCount - 1;
                    currentCount = 1;
                    continue;
                }
                currentCount++;
            }
            deletions += currentCount - 1;
            System.out.println(deletions);
        }
    }
}