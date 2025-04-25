package at.technikum.oop.battleshiplight;

public class Field {
    /*
    private boolean hasShip;

    private boolean isHit;
    */
    private State state;

    public Field() {
        this.state = State.NO_SHIP_NO_HIT;
    }

    public void setShip() {
        this.state = State.SHIP_NO_HIT;
    }

    public boolean hitAndisHit() {
        if (State.NO_SHIP_NO_HIT == this.state) {
            this.state = State.NO_SHIP_HIT;
            return false;
        }
        if (State.SHIP_NO_HIT == this.state) {
            this.state = State.SHIP_HIT;
            return true;
        }
        return false;
    }

    public State getState() {
        return this.state;
    }

    /*
    public void setState(State state) {
        this.state = state;
    }
    */
}
