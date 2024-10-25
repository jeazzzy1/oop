package chess;

public class Knight extends Piece {

    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        return (Math.abs(b.getRow() - position.getRow()) == 2 && Math.abs(b.getCol() - position.getCol()) == 1) ||
                (Math.abs(b.getRow() - position.getRow()) == 1 && Math.abs(b.getCol() - position.getCol()) == 2);
    }
}
