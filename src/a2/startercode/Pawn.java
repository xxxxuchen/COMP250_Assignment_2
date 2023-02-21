package a2.startercode;

public class Pawn extends Piece {
    public Pawn(int x, int y, Side side, Board board){
        super( x, y, side, board);
    }
    @Override
    public boolean canMove(int destX, int destY) {
        // there is enemy in diagonal
        if (board.get(destX, destY) != null){
            if(!board.get(destX, destY).getSide().toString().equals(this.getSide().toString())){
                if((Math.abs(x-destX) == 1 && destY-y == -1) ||
                        (Math.abs(x-destX) == 1 && destY-y == 1)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        // move 2 place
        if(y == 1 || y == 6){
            if((this.x == destX && this.y + 2 == destY) || (this.x == destX && this.y - 2 == destY)){
                return true;
            }
        }
        // move 1 place
        if (this.getSide() == Side.BLACK){
            if(this.x == destX && this.y + 1 == destY){
                return true;
            }
        }else{
            if(this.x == destX && this.y - 1 == destY){
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {

        return this.getSide() == Side.BLACK ? "♟" : "♙";
    }
}
