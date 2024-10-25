package chess;

public class Pawn extends Piece {

    public Pawn(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        return (b.getRow() == position.getRow() + 1 && b.getCol() == position.getCol());
    }
}
