package LLD.Chess;

public class Move {
    private Block start;

    @Override
    public String toString() {
        return "Move{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    private Block end;

    public Block getStart() {
        return start;
    }

    public Move(Block start, Block end) {
        this.start = start;
        this.end = end;
    }

    public Block getEnd() {
        return end;
    }

    public boolean isValidMove(){
        if (end.getPiece() == null ) return true;

        if(start.getPiece().isWhite() && end.getPiece().isWhite())
            return false;
        else
           return true;
    }
}
