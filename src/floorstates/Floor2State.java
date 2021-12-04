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
        elevator.setFloorState(elevator.getFloor1State());
        System.out.println("*ding* the elevator arrives at Floor 1");
    }

    @Override
    public void press2() {
        // TODO: Do nothing
    }

    @Override
    public void press3() {
        elevator.getMediator().moveFloors();
        elevator.setFloorState(elevator.getFloor3State());
        System.out.println("*ding* the elevator arrives at Floor 3");
    }
}
