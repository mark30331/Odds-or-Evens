package kportufe;
import java.util.*;

public class OddsAndEvens
{
    Scanner x = new Scanner(System.in);
    private void game()
    {
        System.out.println("Lets play a game called \"Odds and Evens\" ");
        System.out.print("What is your name? ");
        String fname = x.nextLine();

        System.out.print("Hi " + fname + ", which do you choose? (O)dds or (E)vens? ");
        String userChoose = x.nextLine();

        if (userChoose.equalsIgnoreCase("O"))
        {
            System.out.println(fname + " has picked odds! The computer will be Evens.");
        }
        else if (userChoose.equalsIgnoreCase("E"))
        {
            System.out.println(fname + " has picked evens! The computer will be Odds.");
        }
        System.out.println("--------------------------------------------------");

        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = x.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays "+ computer + " fingers");

        int sum = fingers + computer;
       boolean Even = sum % 2 == 0;
       if( Even)
       {
           System.out.println(fingers + "+" + computer + "=" + sum + " is .... Even");
           if (userChoose.equalsIgnoreCase("E"))
                System.out.println("You won!");
           else
           {
               System.out.println("The computer wins!");
           }
       }
       else
       {
           System.out.println(fingers + "+" + computer + "=" + sum + " is .... odd");
           if (userChoose.equalsIgnoreCase("O"))
               System.out.println("you won!");
           else
           {
               System.out.println("computer won!");
           }
       }
    }

    public static void main(String[] args)
    {
        OddsAndEvens myobj = new OddsAndEvens();
        myobj.game();
    }
}



