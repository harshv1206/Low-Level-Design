package LLD.Chess.PieceImpl;

import LLD.Chess.Block;
import LLD.Chess.Piece;

public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Block start, Block end) {

        return false;
    }
}
