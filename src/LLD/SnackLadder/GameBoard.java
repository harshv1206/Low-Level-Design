package LLD.SnackLadder;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameBoard {
    private Dice dice;
    private Queue<Player> nextTurn;
    private List<Jumper> snakes;
    private List<Jumper> ladders;
    private Map<String,Integer> playerCurrentPos;
    private int boardSize;


   public GameBoard(Dice dice, Queue<Player> nextTurn, List<Jumper> snakes, List<Jumper> ladders, Map<String,Integer> playerCurrentPos, int boardSize){
       this.nextTurn = nextTurn;
       this.snakes = snakes;
       this.ladders = ladders;
       this.playerCurrentPos = playerCurrentPos;
       this.dice = dice;
       this.boardSize = boardSize;
   }
   public void startGame(){
       while(nextTurn.size() > 1){
           Player currPlayer = nextTurn.poll();
           int currPos = playerCurrentPos.get(currPlayer.getName());
           int diceVal = dice.rollDice();

           int nextCell = currPos + diceVal;
           if(nextCell == boardSize){
               System.out.println(currPlayer.getName()+ " won the game");
           }
           else if(nextCell > boardSize){
               nextTurn.add(currPlayer);
           }else{
               for(Jumper s : snakes){
                   if(s.getStartPos() == nextCell){
                       nextCell = s.getEndPos();
                       System.out.println(currPlayer.getName()+" bitten by snake ");
                   }
               }
               for(Jumper l : ladders){
                   if(l.getStartPos() == nextCell){
                       nextCell = l.getEndPos();
                       System.out.println(currPlayer.getName()+" gets the ladder");
                   }
               }
               playerCurrentPos.put(currPlayer.getName(), nextCell);
               nextTurn.add(currPlayer);
           }
       }
   }
}
