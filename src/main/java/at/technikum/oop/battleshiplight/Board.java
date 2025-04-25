package at.technikum.oop.battleshiplight;

import java.util.Random;

public class Board {

     Field[][] fields; // = package-private it seems

    private int shipsToFind = 5;
    private int shipsFound = 0;

    public boolean gameIsFinished( ) {
        return (this.shipsFound>=this.shipsToFind);
    }
    private void registerHit() {
        this.shipsFound++;
    }


    public Board(int size) {
        this.fields = new Field[size][size];

        this.initField();
        this.setRandomShips();
    }

    private void initField() {
        for (int y = 0; y < this.fields.length; y++) {
            for (int x = 0; x < this.fields.length; x++) {
                this.fields[x][y] = new Field();
            }
        }
    }

    private void setRandomShips() {
        for (int i = 0; i < this.fields.length; i++) {
            this.setRandomShip();
        }
    }

    private void setRandomShip() {
        int freeFieldsAmount = this.getFreeFieldsAmount();
        Field[] freeFields = new Field[freeFieldsAmount];

        int i = 0;
        for (int y = 0; y < this.fields.length; y++) {
            for (int x = 0; x < this.fields.length; x++) {
                Field field = this.fields[x][y];

                if (State.NO_SHIP_NO_HIT == field.getState()) {
                    freeFields[i++] = field;
                }
            }
        }

        Random random = new Random();
        int randomFieldNumber = random.nextInt(freeFields.length);

        freeFields[randomFieldNumber].setShip();
    }

    private int getFreeFieldsAmount() {
        int freeFieldsCounter = 0;
        for (int y = 0; y < this.fields.length; y++) {
            for (int x = 0; x < this.fields.length; x++) {
                Field field = this.fields[x][y];

                if (State.NO_SHIP_NO_HIT == field.getState()) {
                    freeFieldsCounter++;
                }
            }
        }
        return freeFieldsCounter;
    }


    // user interaction
    int playerGuessAtShip(String s_lineno, String s_rownum) {
        int lineno, rownum;
        try {
            lineno = Integer.parseInt(s_lineno)-1;
            rownum = Integer.parseInt(s_rownum)-1;
            if (lineno < 0 || rownum < 0) return -2;
            if (lineno >= this.fields.length || rownum >= this.fields[lineno].length) return -3;

            // this is the code that does the "hit"
            if (this.fields[lineno][rownum].hitAndisHit()) {
                this.registerHit();
                return 1;
            };
            return 0;
        } catch (Exception e) {
            System.out.format("DebugInfo: we got an exception: %s\n", e.toString());
            return -1;
        }
    }


}
