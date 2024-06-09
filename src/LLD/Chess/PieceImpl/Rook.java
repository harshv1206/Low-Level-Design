package LLD.Chess.PieceImpl;

import LLD.Chess.Block;
import LLD.Chess.Piece;

public class Rook extends Piece {
    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Block start, Block end) {
        return ((start.getxCordinate() == end.getxCordinate()) ||
                (start.getyCordinate() == end.getyCordinate()));
    }
}
