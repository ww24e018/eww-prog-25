package at.technikum.oop.battleshiplight;

import java.util.Random;

public class Board {

    private Field[][] fields;

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
}
