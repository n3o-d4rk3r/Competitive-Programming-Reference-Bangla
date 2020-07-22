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
        int[] frequencies = new int[100];
        for(int i = 0; i < n; i++)
        {
            int num = input.nextInt(); 
            input.nextLine();//throw away following string
            frequencies[num] = frequencies[num] + 1;
        }
        int sum = 0;
        for(int i = 0; i < frequencies.length; i++)
        {
            sum += frequencies[i];
            System.out.print(sum+" ");
        }
    }
}