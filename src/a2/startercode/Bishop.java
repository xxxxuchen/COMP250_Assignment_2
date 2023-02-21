package a2.startercode;

public class Bishop extends Piece {

    public Bishop(int x, int y, Side side, Board board) {
        // TODO: Call super constructor
        super( x, y, side, board);
    }

    @Override
    public boolean canMove(int destX, int destY) {
        //TODO: Check piecerules.md for the movement rule for this piece :)
        if((Math.abs(this.x - destX) == Math.abs(this.y  - destY))){
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        //if (this instanceof Bishop)
        return this.getSide() == Side.BLACK ? "♝" : "♗";
    }
}
