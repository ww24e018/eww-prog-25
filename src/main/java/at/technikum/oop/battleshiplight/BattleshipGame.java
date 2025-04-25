package at.technikum.oop.battleshiplight;

public class BattleshipGame {

    private int points;
    private int size;
    private Board board;

    public BattleshipGame(int size) {
        this.points = 0;
        this.size = size;
        this.board = new Board(this.size);
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
