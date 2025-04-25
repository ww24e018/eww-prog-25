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

    public void hit() {
        if (State.NO_SHIP_NO_HIT == this.state) {
            this.state = State.NO_SHIP_HIT;
        }
        if (State.SHIP_NO_HIT == this.state) {
            this.state = State.SHIP_HIT;
        }
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
