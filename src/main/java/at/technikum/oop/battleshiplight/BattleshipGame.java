package at.technikum.oop.battleshiplight;

public class BattleshipGame {

    private int points;
    private int size;
    private Board board;

    public BattleshipGame(int size) {
        this.points = 0;
        this.size = size;
        // TODO: refactor
        this.board = new Board(this.size);
    }

    public void start() {
        // TODO: ask player how big the game board should be

        // TODO: print board
        // this.board.print() or this.visualizer.visualize(this.board)

        // TODO: ask player for coordinates

        // TODO: change state accordingly

        // TODO: check score

        // TODO: do game loop until won
    }

    public int getPoints() {
        return this.points;
    }

    /*
    public void setPoints(int points) {
        this.points = points;
    }
    */
}
