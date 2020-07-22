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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        int maxPattern = 0;
        
        if(s.length() == 1)
        {
            System.out.println(maxPattern);
            System.exit(0);
        }
        
        //Loop through all letter pairs
        for(int i = 0; i < 26; i++)
        {
            nextLetter:
            for(int j = i + 1; j < 26; j++)
            {
                char one = (char) ('a' + i); 
                char two = (char) ('a' + j); 
                char lastSeen = '\u0000';
                int patternLength = 0;
                
                for(char letter : s.toCharArray())
                {
                    if(letter == one || letter == two)
                    {
                        if(letter == lastSeen)
                        {
                            continue nextLetter;
                        }
                        //Not a duplicate
                        patternLength++;
                        lastSeen = letter;
                    }
                }
                
                maxPattern = (patternLength > maxPattern) ? patternLength : maxPattern;
                
            }
        }
        
        System.out.println(maxPattern);
        
    }
}
