package floorstates;

import colleagues.Elevator;

public class Floor1State implements FloorState {
    Elevator elevator;

    public Floor1State(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void press1() {
        // TODO: Do nothing
    }

    @Override
    public void press2() {
        elevator.getMediator().moveFloors();
        elevator.setFloorState(elevator.getFloor2State());
    }

    @Override
    public void press3() {
        elevator.getMediator().moveFloors();
        elevator.setFloorState(elevator.getFloor3State());
    }
}
