package floorstates;

import colleagues.Elevator;

public class Floor3State implements FloorState {
    Elevator elevator;

    public Floor3State(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void press1() {
        elevator.getMediator().moveFloors();
        elevator.setFloorState(elevator.getFloor1State());
    }

    @Override
    public void press2() {
        elevator.getMediator().moveFloors();
        elevator.setFloorState(elevator.getFloor2State());
    }

    @Override
    public void press3() {
        // TODO: Do nothing
    }
}
