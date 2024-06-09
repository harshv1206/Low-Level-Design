package LLD.Chess;

public class Block {
    private int xCordinate;
    private int yCordinate;

    @Override
    public String toString() {
        return "Block{" +
                "xCordinate=" + xCordinate +
                ", yCordinate=" + yCordinate +
                ", piece=" + piece +
                '}';
    }

    private Piece piece;

    public Block(int xCordinate, int yCordinate, Piece piece) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.piece = piece;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
