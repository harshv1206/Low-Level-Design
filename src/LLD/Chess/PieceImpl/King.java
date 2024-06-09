package LLD.Chess.PieceImpl;

import LLD.Chess.Block;
import LLD.Chess.Piece;

public class King extends Piece {
    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Block start, Block end) {
        int dx = Math.abs(start.getxCordinate() - end.getyCordinate());
        int dy = Math.abs(start.getyCordinate() - end.getyCordinate());

        return (dx <= 1 && dy <= 1);
    }
}
