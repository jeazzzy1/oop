package chess;

public class Queen extends Piece {

    public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        return (b.getRow() == position.getRow() || b.getCol() == position.getCol() ||
                Math.abs(b.getRow() - position.getRow()) == Math.abs(b.getCol() - position.getCol()));
    }
}
