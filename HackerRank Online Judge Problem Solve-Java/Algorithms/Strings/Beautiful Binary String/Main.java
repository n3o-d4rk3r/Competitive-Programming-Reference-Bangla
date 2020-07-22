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
        input.nextLine();
        String s = input.nextLine();
        int switches = 0;
        
        for(int i = 0; i < s.length()-2; i++)
        {
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1' && s.charAt(i+2) == '0')
            {
                switches++;
                i += 2;
            }
        }
        System.out.println(switches);
    }
}