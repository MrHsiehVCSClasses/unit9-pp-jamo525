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
  ChessPiece test = new King (testArray, 1, 2, false);
  ChessPiece test2 = new King (testArray, 0, 0, false);
testArray[1][2] = test;
testArray[0][0] = test2;
System.out.println(test.canMoveTo(0,1));
System.out.println(test.canMoveTo(1,1));
System.out.println(test2.canMoveTo(0,1));
System.out.println(test2.canMoveTo(1,1));


    }
  
 }

