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
        
        Set<Character> gemstones = stringToSet(input.nextLine());
        
        for(int i=1; i<n ;i++){
            gemstones.retainAll(stringToSet(input.nextLine()));
        }
        System.out.print(gemstones.size());
    }
    
    
    
    
    public static Set<Character> stringToSet(String s)
    {
        Set<Character> set = new HashSet<Character>(26);
        for (char c : s.toCharArray())
            set.add(Character.valueOf(c));
        return set;
    }
}


