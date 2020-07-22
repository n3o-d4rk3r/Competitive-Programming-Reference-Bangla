package hackerrank;

import java.util.Scanner;

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
    private static String largestPalindrome(String number, int k) {
        char[] chars = number.toCharArray();
        int minChange = 0;
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                minChange++;
            }
        }
        if (minChange > k) {
            return "-1";
        }
        int changeBoth = k - minChange;
        int i = 0;
        int j = chars.length - 1;
        for (; i <= j; i++, j--) {
            if (chars[i] != chars[j]) {
                char maxChar = (char) Math.max(chars[i], chars[j]);
                if (maxChar != '9' && changeBoth - 1 >= 0) {
                    chars[i] = '9';
                    chars[j] = '9';
                    changeBoth--;
                } else {
                    chars[i] = maxChar;
                    chars[j] = maxChar;
                    minChange--;
                }
            } else {
                char maxChar = (char) Math.max(chars[i], chars[j]);
                if (maxChar != '9' && changeBoth - 2 >= 0) {
                    chars[i] = '9';
                    chars[j] = '9';
                    changeBoth -= 2;
                }
            }
        }
        if (changeBoth != 0 && i - 1 == j + 1) {
            chars[i - 1] = '9';
        }
        String palindrome = new String(chars);
        return palindrome;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        System.out.println(largestPalindrome(number, k));
    }
}