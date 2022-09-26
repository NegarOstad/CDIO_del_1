import Spil.Die;
import Spil.Players;
import Spil.Sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Die die1 , die2;
        int d1 , d2;
        final int MAXPOINT = 40;
        //int sum;
       Sum sum_player_1 , sum_player_2;
       int result;

        die1 = new Die();
        die2 = new Die();

        sum_player_1 = new Sum();
        sum_player_2 = new Sum();

        String player1 , player2 ;
        int player_1_result = 0 , player_2_result = 0 ;

        System.out.println("Dear players, enter your names:");
        Scanner scan = new Scanner(System.in);

        player1 = scan.nextLine();
        player2 = scan.nextLine() ;

        System.out.println("Please roll the dice");
        while (player_1_result < MAXPOINT || player_2_result < MAXPOINT ){

            if ( player_1_result < MAXPOINT && player_2_result < MAXPOINT){

                System.out.println(player1 + " is your turn:");
                scan.nextLine();

                 d1 = die1.roll() ;
                d2 = die2.roll() ;
                System.out.println(" Die one: " + die1 + " Die two: " + die2);

                player_1_result += sum_player_1.getSum(d1,d2);

                System.out.println(player1 + " your points is: " + player_1_result);

            }
            if ( player_1_result < MAXPOINT && player_2_result < MAXPOINT){

                System.out.println(player2 + " is your turn:");
                scan.nextLine();

                d1 = die1.roll() ;
                d2 = die2.roll() ;
                System.out.println(" Die one: " + die1 + " Die two: " + die2);

                player_2_result += sum_player_2.getSum(d1,d2);

                System.out.println(player2 + " your points is: " + player_2_result);

            }


        }



    }
}