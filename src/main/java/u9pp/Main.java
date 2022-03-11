package u9pp;

import java.util.*;

import u9pp.MonsterFighter.*;
//import u9pp.Chess.Chess;
import u9pp.Chess.*;
public class Main 
{
  
    public static void main( String[] args ) {

 /*       Scanner scanner = new Scanner(System.in);

        String prompt = "Welcome to u9pp :)\nAvailable games:\n"
            + "1: Monster Fighter\n"
            + "2: Chess\n"
            + "Select a game: ";
        int gameSelection = InputHelper.getValidNumberInput(scanner, prompt, 1, 2);

        if(gameSelection == 1) 
        {
            MonsterFighterGame game = new MonsterFighterGame();
            game.play(scanner);
        } 
        else if (gameSelection == 2) 
        {
            Chess chess = new Chess();
            chess.play(scanner);
        }
        
        scanner.close();
      */
  ChessPiece[][] testArray = new ChessPiece[8][8];
  ChessPiece test = new Pawn (testArray, 1, 3, true);
  ChessPiece test2 = new Pawn (testArray, 5, 4, false);
testArray[1][3] = test;
testArray[5][4] = test2;
System.out.println(test.canMoveTo(3, 3));
test.doMove(3, 3);
System.out.println(test2.canMoveTo(4, 4));
test.doMove(4,3);
System.out.println(test.canMoveTo(4, 4));
test.doMove(4,4);


    }
  
 }

