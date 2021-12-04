package floorstates;

import colleagues.Elevator;

public class Floor2State implements FloorState {
    Elevator elevator;

    public Floor2State(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void press1() {
        elevator.getMediator().moveFloors();
    }

    @Override
    public void press2() {
        // TODO: Do nothing
    }

    @Override
    public void press3() {
        elevator.getMediator().moveFloors();
    }
}
