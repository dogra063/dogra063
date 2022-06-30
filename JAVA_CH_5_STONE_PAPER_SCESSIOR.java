import java.util.Random;
import java.util.Scanner;

public class JAVA_CH_5_STONE_PAPER_SCESSIOR {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Continue=1;
        int Your_total=0;
        int Computer_total=0;
        int Your_score=0;
        int Computer_score=0;

        System.out.print("Choice 1 for Stone\nChoice 2 for Paper\nChoice 3 for Scissor\n\n");
       do {
           System.out.print("\n\nMatch: "+Continue);
           System.out.print("\nEnter Your Choice:");
            int Your_Choice=sc.nextInt();
          if (Your_Choice==1)
          {
              System.out.println("Your   Choice   is: Stone");
          }
         else if (Your_Choice==2)
          {
              System.out.println("Your   Choice   is: Paper");
          }
         else if (Your_Choice==3)
          {
              System.out.println("Your   Choice   is: Scissor");
          }
         else {
              System.out.println("Choice Out of Game i.e "+Your_Choice);
          }


           int Stone = 1;
           int Paper = 2;
           int Scissor = 3;

           Random randomNum = new Random();
           int showMe = Stone + randomNum.nextInt(Scissor);
           //System.out.println(showMe);

           switch (showMe)
           {
               case 1:
               {
                   System.out.println("Computer Choice is: Stone");

               }
               break;
               case 2:
               {
                   System.out.println("Computer Choice is: Paper");

               }
               break;
               case 3:
               {
                   System.out.println("Computer Choice is: Scissor");
               }
               break;
               default:
               {
                   System.out.println("no choice");
               }
               break;
           }
           if (Your_Choice==1 && showMe==2)
           {
               System.out.println("Computer Win");
               Computer_score++;
           }
           else if (Your_Choice==1 && showMe==3)
           {
               System.out.println("You Win");
               Your_score++;
           }
           else if  (Your_Choice==2 && showMe==1)
           {
               System.out.println("You win");
               Your_score++;
           }
           else if  (Your_Choice==2 && showMe==3)
           {
               System.out.println("Computer win");
               Computer_score++;
           }
           else if  (Your_Choice==3 && showMe==1)
           {
               System.out.println("Computer win");
               Computer_score++;
           }
           else if  (Your_Choice==3 && showMe==2)
           {
               System.out.println("you win");
               Your_score++;
           }
           else
           {
               System.out.println("Match Draw");
           }

           Your_total=Your_total+Your_score;
           Computer_total=Computer_total+Computer_score;

//           System.out.println(Continue);
//           System.out.println(Your_score);
//           System.out.println(Your_total);
//           System.out.println(Computer_total);

           if (Your_total > Computer_total && Continue==5 )
           {
               System.out.println("\n\n\t" + Continue +" Matches Series Ended\n\tYou win this series");
               System.out.println("\n\t\t You win "+ Your_total+" Matches");
               System.out.println("\n\t\t Computer win "+ Computer_total+" Matches");
           }
           else if (Your_total < Computer_total && Continue==5 ) {
               System.out.println("\n\n\t" + Continue +" Matches Series  Ended\n\tComputer win this series");
               System.out.println("\n\t\t Computer win "+ Computer_total+" Matches");
               System.out.println("\n\t\t You win "+ Your_total+" Matches");
           }
           else if(Your_total == Computer_total && Continue==5 )
           {
               System.out.println("Series Draw");
           }
//           System.out.println(Your_total);
//           System.out.println(Computer_total);
           Continue++;
           Your_score=0;
           Computer_score=0;
       }while (Continue<=5);


        }
    }

