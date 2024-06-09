package LLD.Chess.PieceImpl;

import LLD.Chess.Block;
import LLD.Chess.Piece;

public class Knight extends Piece {
    public Knight(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Block start, Block end) {
        int dx = Math.abs(start.getxCordinate() - end.getxCordinate());
        int dy = Math.abs(start.getyCordinate() - end.getyCordinate());

        return ((dx == 2 && dy == 1) || (dx == 1 && dy == 2));
    }
}
