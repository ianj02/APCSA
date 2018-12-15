
/**
 * Write a description of class Password here.
 *
 * @author Ian Jackson
 * @version 11/27/2018
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class Password
{
    public static void main(String [] args) throws IOException
    {
        //97-122 = lowercase
        //48-57 & 97-122 num & low
        //65-90 & 48-57 & 97-122 uppc & num & low
        //65-90 & 48-57 & 91-96 & 97-122 uppc & num & punc & low
        //declare variables
        Random random = new Random();
        Scanner inFile = new Scanner (new File("passwords.txt"));
        Scanner in = new Scanner(System.in);
        int selection = 1;
        int passwordLength;
        int charGene;
        int passChar;
        int token;
        String password = "";
        int loopSelect;

        //Menu
        System.out.println("\t\tPassword Generator Menu");
        System.out.println("********************************************************");
        System.out.println("* [1] Lowercase Letters                                *");
        System.out.println("* [2] Lowercase and Numbers                            *");
        System.out.println("* [3] Lowercase, Uppercase, & Numbers                  *");
        System.out.println("* [4] Lowercase, Uppercase, Numbers, & Punctuation     *");
        System.out.println("* [5] Quit                                             *");
        System.out.println("********************************************************");
        System.out.println();
        while (selection != 5)
        {
            PrintWriter outFile = new PrintWriter (new File("passwords.txt"));
            System.out.println("Enter Selection (1-5): ");
            selection = in.nextInt();

            //Lowercase Letters
            if (selection == 1)
            {
                System.out.println("Password Length (6 or more): ");
                passwordLength = in.nextInt();

                for (charGene = 0; charGene < passwordLength; charGene++)
                {
                    passChar = random.nextInt(24) + 97;
                    outFile.println(passChar);
                }
                outFile.close();

                while (inFile.hasNextInt())
                {
                    token = inFile.nextInt();
                    password += (char)token;
                }
                System.out.println("Randomly generated password: " + password);
            }

            //Lowercase and Numbers
            if (selection == 2)
            {
                int lengthCount = 0;
                System.out.println("Password Length (6 or more): ");
                passwordLength = in.nextInt();
                while (lengthCount < passwordLength)
                {
                    loopSelect = random.nextInt(2) + 1;
                    if (loopSelect == 1)
                    {
                        passChar = random.nextInt(24) + 97;
                        outFile.println(passChar);
                    }
                    else if (loopSelect == 2)
                    {
                        passChar = random.nextInt(9) + 48;
                        outFile.println(passChar);
                    }
                    lengthCount++;
                }
                outFile.close();

                while (inFile.hasNextInt())
                {
                    token = inFile.nextInt();
                    password += (char)token;
                }
                System.out.println("Randomly generated password: " + password);
            }

            //Lowercase, Uppercase, & Numbers
            if (selection == 3)
            {
                int lengthCount = 0;
                System.out.println("Password Length (6 or more): ");
                passwordLength = in.nextInt();
                while (lengthCount < passwordLength)
                {
                    loopSelect = random.nextInt(3) + 1;
                    if (loopSelect == 1)
                    {
                        passChar = random.nextInt(24) + 97;
                        outFile.println(passChar);
                    }
                    else if (loopSelect == 2)
                    {
                        passChar = random.nextInt(9) + 48;
                        outFile.println(passChar);
                    }
                    else if (loopSelect == 3)
                    {
                        passChar = random.nextInt(24) + 65;
                        outFile.println(passChar);
                    }
                    lengthCount++;
                }
                outFile.close();

                while (inFile.hasNextInt())
                {
                    token = inFile.nextInt();
                    password += (char)token;
                }
                System.out.println("Randomly generated password: " + password);
            }

            //Lowercase, Uppercase, Numbers, & Punctuation
            if (selection == 4)
            {
                int lengthCount = 0;
                System.out.println("Password Length (6 or more): ");
                passwordLength = in.nextInt();
                while (lengthCount < passwordLength)
                {
                    loopSelect = random.nextInt(4) + 1;
                    if (loopSelect == 1)
                    {
                        passChar = random.nextInt(24) + 97;
                        outFile.println(passChar);
                    }
                    else if (loopSelect == 2)
                    {
                        passChar = random.nextInt(9) + 48;
                        outFile.println(passChar);
                    }
                    else if (loopSelect == 3)
                    {
                        passChar = random.nextInt(24) + 65;
                        outFile.println(passChar);
                    }
                    else if (loopSelect == 4)
                    {
                        passChar = random.nextInt(5) + 91;
                        outFile.println(passChar);
                    }
                    lengthCount++;
                }
                outFile.close();

                while (inFile.hasNextInt())
                {
                    token = inFile.nextInt();
                    password += (char)token;
                }
                System.out.println("Randomly generated password: " + password);
                
            }

            //Quit
            if (selection == 5)
            {
                System.out.println("Thank you. The password generator will exit now");
            }
            System.out.println();
        }
    }
}
