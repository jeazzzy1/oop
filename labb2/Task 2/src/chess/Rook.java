package chess;

public class Rook extends Piece {

    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return (b.getRow() == position.getRow() || b.getCol() == position.getCol());
    }
}
