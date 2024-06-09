package LLD.Chess;

import LLD.Chess.PieceImpl.King;

import java.util.List;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private boolean isWhiteTurn;
    private GameStatus status;

    public Game(){
        board = new Board();
        player1 = new Player(1,"xyz");
        player2 = new Player(2,"abc");
        isWhiteTurn = true;
        status = GameStatus.ACTIVE;
    }

    public void start(){
        while(status == GameStatus.ACTIVE){
            if(isWhiteTurn){
//                (2,3) (5,6)
                int x1 = 0, x2 = 3, y1 =3, y2 = 6;

                 Block start = board.getBlock(x1,y1);
                 Block end = board.getBlock(x2,y2);
                System.out.println("piece: "+start.getPiece());
                 List<Move> possibleMoves = start.getPiece().getPossibleMoves(start,board);
                System.out.println("possibleMoves: "+possibleMoves);
                System.out.println("faad denge");
                System.out.println(possibleMoves.get(0).getEnd());
                makeMove(possibleMoves.get(0),player1);
                System.out.println("Test");
              }//else{
//                makeMove(possibleMoves.get(0),player2);
//            }
        }
    }

    public void makeMove(Move move, Player player){
        if(move.isValidMove()){
            Piece sourcePiece = move.getStart().getPiece();
            if(sourcePiece.canMove(move.getStart(),move.getEnd())){
                Piece destinationPiece = move.getEnd().getPiece();
                if(destinationPiece != null){
                    if(destinationPiece == new King(false) && isWhiteTurn){
                        status = GameStatus.WHITEWIN;
                        return;
                    }
                    if(destinationPiece == new King(true) && !isWhiteTurn){
                        status = GameStatus.BLACKWIN;
                        return;
                    }
                    destinationPiece.setKilled(true);
                }
                move.getEnd().setPiece(sourcePiece);
                move.getStart().setPiece(null);
                isWhiteTurn = !isWhiteTurn;
            }

        }
    }
}
