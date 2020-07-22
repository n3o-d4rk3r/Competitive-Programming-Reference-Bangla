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
* Java 7
 */
public class Main {


    static int solveMeFirst(int a, int b) {
      
      return a+b;
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}