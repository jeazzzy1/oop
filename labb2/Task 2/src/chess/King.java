package chess;

public class King extends Piece {

    public King(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return Math.abs(b.getRow() - position.getRow()) <= 1 &&
                Math.abs(b.getCol() - position.getCol()) <= 1;
    }
}
