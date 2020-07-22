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
        int q = in.nextInt();
        queries:
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            char[] find = "hackerrank".toCharArray(); 
            int findIndex = 0;
            
            for(char c : s.toCharArray())
            {
                if(find[findIndex] == c)
                    findIndex++;
                
                if(findIndex == find.length){
                    System.out.println("YES");
                    continue queries;
                }
                    
            }
            System.out.println("NO");
        }
    }
}
