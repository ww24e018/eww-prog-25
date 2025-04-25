package at.technikum.oop.battleshiplight;

public class BoardVisualizer {




    public void visualize(Board board) {
        // TODO
        //System.out.println("This board was visualiz3ed");

        // iterate board.fields?
        for (int lineno = 0; lineno < board.fields.length ; lineno++) {
            for (int rownum = 0; rownum < board.fields[lineno].length; rownum++) {
                System.out.format("%s ", this.enumStateToChar(board.fields[lineno][rownum]));
            }
            System.out.format("\n");
        }
    }

    public String enumStateToChar(Field field) {
        State state = field.getState();
        if (state == State.NO_SHIP_NO_HIT || state == State.SHIP_NO_HIT) {
            return "~";
        } else if (state == State.NO_SHIP_HIT) {
            return "O";
        } else { // if (state == State.SHIP_HIT) {
            return "X";
        }
    }

}
