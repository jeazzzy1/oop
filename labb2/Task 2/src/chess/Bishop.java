package chess;

public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        return Math.abs(b.getRow() - position.getRow()) == Math.abs(b.getCol() - position.getCol());
    }
}
