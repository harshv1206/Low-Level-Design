package LLD.Chess.PieceImpl;

import LLD.Chess.Block;
import LLD.Chess.Piece;

public class Queen extends Piece {
    public Queen(boolean white) {
        super(white);
    }
    @Override
    public boolean canMove(Block start, Block end) {
        int x1 = start.getxCordinate();
        int x2 = end.getxCordinate();
        int y1 = start.getyCordinate();
        int y2 = end.getyCordinate();
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);

        return (dx == dy || x1 == x2 || y1 == y2 );
    }
}
