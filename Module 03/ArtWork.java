
/**
 * Create my own ASCII art
 *
 * @author Ian Jackson
 * @version 9/27/2018
 */
public class ArtWork
{
    public static void main(String[] args)
    {
        String row1 = "I I I I I     A A A     N N     N\n";
        String row2 = "    I       A       A   N   N   N\n";
        String row3 = "    I       A A A A A   N   N   N\n";
        String row4 = "    I       A       A   N   N   N\n";
        String row5 = "I I I I I   A       A   N     N N\n";
        
        String row6 = "J J J J J     A A A       C C C C   K     K     S S S S     O O O     N N     N\n";
        String row7 = "    J       A       A   C           K   K     S           O       O   N   N   N\n";
        String row8 = "    J       A A A A A   C           K K         S S S     O       O   N   N   N\n";
        String row9 = "J   J       A       A   C           K   K             S   O       O   N   N   N\n";
        String row10= "J J J       A       A     C C C C   K     K   S S S S       O O O     N     N N\n";
        
        String signature = "Ian Jackson";
                
        System.out.print(row1);
        System.out.print(row2);
        System.out.print(row3);
        System.out.print(row4);
        System.out.print(row5);
        
        System.out.print(row6);
        System.out.print(row7);
        System.out.print(row8);
        System.out.print(row9);
        System.out.print(row10);
        
        System.out.print(signature);
    }
}
