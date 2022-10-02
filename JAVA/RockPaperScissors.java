/**
 * 
 * @author Jeff Blankenship
 * @since 10/1/2022
 *
 */
import java.util.Scanner;

public class RockPaperScissors {
  
  public static String move(int move) {
    if (move==1) {
      return "rock";
    } else if (move==2) {
      return "paper";
    } else if (move==3) {
      return "scissors";
    }
    //only reaches here if move is not 1,2, or 3
    return "error";
  }
  
  public static void printMoves(int computer, int human) {
    System.out.println("Computer move: " + move(computer));
    System.out.println("Human move: " + move(human));
  }

  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Welcome to rock, paper, scissors");
    int computerMove = (int) (Math.random()*3+1);
    //computer will have 1,2,3
    System.out.println("I've chosen my move, what's yours?");
    System.out.println("enter 1(rock), 2(paper), 3(scissors)");
    int playerMove = Integer.parseInt(keyboard.nextLine());
    
    
    
    if (playerMove>3 || playerMove<1) {
    //player will have 1,2,3 or be rejected
      System.out.println("Invalid entry, no winner.");
    } else {
      printMoves(computerMove,playerMove);
      //player wins if playerMove is one more than computerMove
      if ((playerMove==3 && computerMove==2)
        ||(playerMove==2 && computerMove==1)
        ||(playerMove==1 && computerMove==3)) {
        System.out.println("*** YOU WIN ***");
      } else if  ((playerMove==1 && computerMove==2)
                ||(playerMove==2 && computerMove==3)
                ||(playerMove==3 && computerMove==1)) {
        System.out.println("*** COMPUTER WINS ***");
      } else {
        System.out.println("--- it's a tie, no winner ---");
      }
      
    }
    keyboard.close();

  }

}
