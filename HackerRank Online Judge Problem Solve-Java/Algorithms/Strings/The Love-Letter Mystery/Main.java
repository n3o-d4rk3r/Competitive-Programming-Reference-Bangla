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
            int operationsPerformed = 0;
            int i = 0;
            int j = s.length() - 1;
            while(i < j)
            {
                operationsPerformed += Math.abs(s.charAt(i) - s.charAt(j));
                i++;
                j--;
            }
            System.out.println(operationsPerformed);
        }
    }
}