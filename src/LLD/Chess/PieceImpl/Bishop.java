package LLD.Chess.PieceImpl;

import LLD.Chess.Block;
import LLD.Chess.Piece;

public class Bishop extends Piece {
    public Bishop(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Block start, Block end) {
        int dx = Math.abs(start.getxCordinate() - end.getyCordinate());
        int dy = Math.abs(start.getyCordinate() - end.getyCordinate());
        return (dx == dy);
    }
}
