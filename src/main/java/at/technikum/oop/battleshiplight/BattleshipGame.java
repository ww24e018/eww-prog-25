package at.technikum.oop.battleshiplight;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BattleshipGame {

    private int points;
    private int size;
    private Board board;
    private BoardVisualizer visualizer;

    private boolean userWantsToQuit = false;


    public BattleshipGame(int size) {
        this.points = 0;
        this.size = size;
        // TODO: refactor
        this.board = new Board(this.size);
        this.visualizer = new BoardVisualizer();
    }


    public void start() {

        // runloop fuer 1 (eins) game
        Scanner sc = new Scanner(System.in);
        String playerInput = "";
        String pattern = "([0-9]+)[, -]+([0-9]+)";
        Pattern pattern1 = Pattern.compile(pattern);
        while(!board.gameIsFinished() && !this.userWantsToQuit) {
            // do the runloop
            this.visualizer.visualize(this.board);

            if (this.userWantsToQuit) { break; } // here, because 1 last vis is nice

            // TODO: ask player for coordinates
            playerInput = sc.nextLine().trim();

            // TODO: change state accordingly

            // check for quitting
            userWantsToQuit |= playerInput.equalsIgnoreCase("q");
            if (userWantsToQuit) { continue; }

            if (playerInput.equalsIgnoreCase("help")) this.printHelp();

            Matcher m = pattern1.matcher(playerInput.trim());
            if (m.find()) {
                // first match only ; only if match
                //System.out.format("%s --- %s\n", m.group(1), m.group(2));
                int res = board.playerGuessAtShip(m.group(1), m.group(2));
                if (res < 0) {
                    // this probably means the [0-9]+ was too big to parse or over the board size
                    System.out.format("The board finds you input .. lacking.\n");
                };
                if (res == 1) {

                }
            }

            // TODO: check score


        }


        // TODO: do game loop until won
    }

    public int getPoints() {
        return this.points;
    }

    public void printHelp() {
        System.out.format("q to quit; <int>[, -]+<int> for guesses; help for help\n");
    }

    /*
    public void setPoints(int points) {
        this.points = points;
    }
    */
}
