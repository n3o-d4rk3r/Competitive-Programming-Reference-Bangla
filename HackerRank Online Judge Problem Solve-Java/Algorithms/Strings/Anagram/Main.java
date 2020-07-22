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
            
            if(s.length() % 2 == 1)
            {
                System.out.println(-1); continue tests;
            }
            
            
            Map<Character,Integer> firstHalf = new HashMap<>();
            Map<Character,Integer> secondHalf = new HashMap<>();
            
            for(int i = 0; i < s.length()/2; i++)
            {
                if(firstHalf.containsKey(s.charAt(i)))
                    firstHalf.put(s.charAt(i), firstHalf.get(s.charAt(i)) + 1);
                else
                    firstHalf.put(s.charAt(i), 1);
            }
                
            for(int i = s.length()/2; i < s.length(); i++)
            {
                if(secondHalf.containsKey(s.charAt(i)))
                    secondHalf.put(s.charAt(i), secondHalf.get(s.charAt(i)) + 1);
                else
                    secondHalf.put(s.charAt(i), 1);
            }
            int operations = 0;
            
            for(Map.Entry<Character,Integer> letter : secondHalf.entrySet())
            {
                
                int f2 = letter.getValue();
                int f1 = (firstHalf.get(letter.getKey()) != null) ? firstHalf.get(letter.getKey()) : 0;
                
                if(f2 > f1)
                    operations += (f2 - f1);  
                
                
            }
            System.out.println(operations);
        }
    }
}