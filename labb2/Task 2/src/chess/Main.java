package chess;

public class Main {
    public static void main(String[] args) {
        Position startPosRook = new Position(0, 0);
        Rook rook = new Rook(startPosRook);

        Position newPosRook = new Position(0, 5);
        System.out.println("Rook legal move to (0, 5): " + rook.isLegalMove(newPosRook));

        Position startPosKing = new Position(0, 4);
        King king = new King(startPosKing);

        Position newPosKing = new Position(1, 5);
        System.out.println("King legal move to (1, 5): " + king.isLegalMove(newPosKing));

        Position startPosQueen = new Position(0, 3);
        Queen queen = new Queen(startPosQueen);

        Position newPosQueen = new Position(2, 3);
        System.out.println("Queen legal move to (2, 3): " + queen.isLegalMove(newPosQueen));
    }
}
