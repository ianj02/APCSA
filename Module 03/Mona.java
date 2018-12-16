
/**
 * Write a description of class Mona here.
 *
 * @author Ian Jackson
 * @version V1 (10/4/2018)
 */
import java.util.Scanner;
public class Mona
{
    public static void main(String args[])
    {
        // declare varibles
        String lastName;            // last name name of person
        String firstName;           // first name of person
        String phoneNumber;         // 1st string of numbers
        String nameOfBook;          // name of the book
        String dateBookCheckedOut;  // date the book was checked out
        String daysBooksOverdue;    // days the book was overdue
        String dailyFine;           // daily fine amount
        
        // construct a Scanner object
        Scanner in;
        in = new Scanner(System.in);
        
        // name
        System.out.print("Enter the name (Last , First): ");
        lastName = in.next();
        String comma = in.next();
        firstName = in.nextLine();
        System.out.println();
        
        // phone number
        System.out.print("Enter the phone number (###) ###-####: ");
        phoneNumber = in.nextLine();
        System.out.println();
        
        // name of the book overdue
        System.out.print("Enter the title of the book: ");
        nameOfBook = in.nextLine();
        System.out.println();
        
        // date the book was checked out
        System.out.print("Enter the date checked out (mm/dd/yyyy): ");
        dateBookCheckedOut = in.nextLine();
        System.out.println();
        
        // days late
        System.out.print("Days late: ");
        daysBooksOverdue = in.nextLine();
        System.out.println();
        int daysOverdueInt = Integer.parseInt(daysBooksOverdue);
        
        // daily fine
        System.out.print("Daily fine: ");
        dailyFine = in.nextLine();
        System.out.println();
        double dailyFineDouble = Double.parseDouble(dailyFine);
        System.out.println("\n");
        
        // total fine
        double totalFine = daysOverdueInt * dailyFineDouble;
        
        //email address
        String emailP1 = firstName.substring(1,2);
        String emailP2 = lastName.substring(0,2);
        String emailLowerP1 = emailP1.toLowerCase();
        String emailLowerP2 = emailP2.toLowerCase();
        String emailNumber = phoneNumber.substring(10, 14);
        String email = (emailLowerP1 + emailLowerP2 + emailNumber + "@csamediacenter.com");
        
        //email
        System.out.println("---------- Text for email message ----------\n");
        System.out.println("To: " + firstName + " " + lastName + " (" + email + ")");
        System.out.println();
        System.out.println("From: Mona (mona@csamediacenter.com)");
        System.out.println();
        System.out.println("Subject: Overdue Book Notice");
        System.out.println("============================================================================");
        System.out.println(nameOfBook + " was checked out on: " + dateBookCheckedOut);
        System.out.println("This book is currently " + daysBooksOverdue + " day(s) late");
        System.out.println("Your fine has accumulated to: " + totalFine + " dollar(s)");
    }
}
