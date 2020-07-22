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
        String inputString = input.nextLine();
        StringBuilder lastOutput = new StringBuilder(inputString);
        
        
        while(true)
        {
            StringBuilder currentOutput = new StringBuilder("");
            String s = lastOutput.toString();
            char past = s.charAt(0);
            int count = 0;
            for(int i = 0; i < s.length(); i++)
            {
                char current = s.charAt(i);

                if(past == current)
                    count += 1;
                else if (count == 1)
                {
                    currentOutput.append(past);
                    count = 1;
                }
                else
                    count = 1;

                if(count == 2)
                    count = 0;

                past = current;
            }
            
            if(count == 1)
                currentOutput.append(s.charAt(s.length()-1));
            
            
            if(currentOutput.toString().equals(""))
            {
                System.out.println("Empty String");
                System.exit(0);
            }
            
            
            if(currentOutput.toString().equals(lastOutput.toString()))
                break;
            else
                lastOutput = new StringBuilder(currentOutput.toString());
        }
        
        System.out.println(lastOutput);
    }
}