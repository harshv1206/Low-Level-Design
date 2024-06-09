package LLD.Chess;

import java.util.ArrayList;
import java.util.List;

public abstract class  Piece {
    private boolean white;
    private boolean isKilled = false;

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    protected Piece(boolean white){
        this.white = white;
    }
    public abstract boolean canMove(Block start, Block end);
    public boolean isWhite(){
        return white;
    }

    public List<Move> getPossibleMoves(Block start, Board board){
        List<Move> possibleMoves = new ArrayList<>();
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                Block end = board.getBlock(i,j);

                if(canMove(start,end)){
                    if(end.getPiece() != null && end.getPiece().isWhite() != start.getPiece().isWhite())
                       possibleMoves.add(new Move(start,end));
                    if(end.getPiece() == null){
                        possibleMoves.add(new Move(start,end));
                    }
                }
            }
        }
        return possibleMoves;
    }



}
