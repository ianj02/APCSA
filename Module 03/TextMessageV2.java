
/**
 * Write a description of class TextMessageV1 here.
 *
 * @author Ian Jackson
 * @version 9/28/2018
 */

import java.util.Scanner;

public class TextMessageV2
{
    public static void main(String[] args)
    {
        //starting Message
        String message = "i will be right back, i got to go to the grocery store. i am getting bacon, lettuce, and tomatoes. see you soon, talk to you later.";
        
        //Accept user input
        Scanner messageIn = new Scanner(System.in);
        System.out.println("Please enter a sentence (Use lowercase):    ");
        message = messageIn.nextLine();
        
        //length of starting message
        int lengthOfMessage = message.length();
        
        //replaceing words in starting message
        String replaceMessage = message.replace("be right back" , "brb");
        replaceMessage = replaceMessage.replace("got to go" , "gtg");
        replaceMessage = replaceMessage.replace("bacon, lettuce, and tomatoes" , "blt");
        replaceMessage = replaceMessage.replace("see you soon" , "sys");
        replaceMessage = replaceMessage.replace("talk to you later" , "ttyl");
        replaceMessage = replaceMessage.replace("oh my gosh" , "omg");
       
        //length if new message
        int lengthOfNewMessage = replaceMessage.length();
        
        //find the index of "r"
        int indexOfr = message.indexOf("o");
        
        //find the halfway point of the new message
        int halfwayPoint = lengthOfNewMessage / 2;
        
        //make Strings for the first half and the second half
        String firstHalf = replaceMessage.substring(0 , halfwayPoint);
        String secondHalf = replaceMessage.substring(halfwayPoint , lengthOfNewMessage);
        
        //replace the letters i, a, and n in the new message
        String noLetters = replaceMessage.replaceAll("[ian]", "");
        
        System.out.println("Original Message: \n" + " " + message);
        System.out.println(" " + "Message length: " + lengthOfMessage);
        System.out.println("");
        System.out.println("New Message: \n" + " " + replaceMessage);
        System.out.println(" " + "Message length: " + lengthOfNewMessage);
        System.out.println("");
        System.out.println("String Method Samples:");
        System.out.println(" " + "indexOf \"r\":                  " + indexOfr); 
        System.out.println(" " + "substring (First half):       " + firstHalf);
        System.out.println(" " + "substring (Second half):      " + secondHalf);
        System.out.println(" " + "replaceAll \"ian\"\'s:          " + noLetters);
    }
}
