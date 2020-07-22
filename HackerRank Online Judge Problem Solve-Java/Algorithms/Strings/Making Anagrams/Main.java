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
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        Map<Character, Integer> s1Frequency = new HashMap<>();
        Map<Character, Integer> s2Frequency = new HashMap<>();
        int deletions = 0;
        
        for(int i = 'a'; i <= 'z'; i++)
        {
            s1Frequency.put((char) i, 0);
            s2Frequency.put((char) i, 0);
        }
        
        for(char c : s1.toCharArray())
            s1Frequency.put(c, s1Frequency.get(c) + 1);
        
        for(char c : s2.toCharArray())
            s2Frequency.put(c, s2Frequency.get(c) + 1);
        
        for(char letter : s1Frequency.keySet())
        {
            int f1 = s1Frequency.get(letter);
            int f2 = s2Frequency.get(letter);
            
            deletions += Math.abs(f1 - f2);
        }
        
        System.out.println(deletions);
    }
}