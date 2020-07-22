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
        int n = input.nextInt();input.nextLine();
        String word = input.nextLine();
        int rotation = input.nextInt();
        StringBuilder encryptedWord = new StringBuilder("");
        for(char c : word.toCharArray())
        {
            if(c >= 'a' && c <= 'z')
                encryptedWord.append((char) ('a'+(((c-'a')+rotation)%26)));
            else if(c >= 'A' && c <= 'Z')
                encryptedWord.append((char) ('A'+(((c-'A')+rotation)%26)));
            else
                encryptedWord.append(c);
                
        }
        System.out.println(encryptedWord);
    }
}