using System;

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
public class Main
{
    static void Main(string[] args)
    {
        var extraChars = 0;
        var digitOccured = false;
        var lowerCaseOccured = false;
        var upperCaseOccured = false;
        var specialCharsOccured = false;
        var desiredLength = 0;

        Console.ReadLine();
        var nextChar = Console.Read();


        while (nextChar != -1)
        {
            if (nextChar >= 48 && nextChar <= 57)
                digitOccured = true;

            if (nextChar >= 97 && nextChar <= 122)
                lowerCaseOccured = true;

            if (nextChar >= 65 && nextChar <= 90)
                upperCaseOccured = true;


            if (nextChar == 33
               || nextChar == 64
               || nextChar == 94
               || nextChar == 45
               ) 
                specialCharsOccured = true;

            if (nextChar >= 35 && nextChar <= 38) 
                specialCharsOccured = true;


            if (nextChar >= 40 && nextChar <= 43)
                specialCharsOccured = true;

            desiredLength++;
            if (digitOccured && lowerCaseOccured && upperCaseOccured && specialCharsOccured && desiredLength >= 6)
                break;

            nextChar = Console.Read();
        }

        if (!digitOccured)
            extraChars++;

        if (!lowerCaseOccured)
            extraChars++;

        if (!upperCaseOccured)
            extraChars++;

        if (!specialCharsOccured)
            extraChars++;

        if (desiredLength + extraChars < 6)
            extraChars += 6 - extraChars - desiredLength;

        Console.WriteLine(extraChars);

    }
}