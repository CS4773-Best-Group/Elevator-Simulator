package floorstates;

import colleagues.Elevator;

public class Floor3State implements FloorState {
    Elevator elevator;

    public Floor3State(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void press1() {
        System.out.println("Going down...");
        elevator.getMediator().moveFloors();
        elevator.setFloorState(elevator.getFloor1State());
        System.out.println("*ding* The elevator arrives at Floor 1");
    }

    @Override
    public void press2() {
        System.out.println("Going down...");
        elevator.getMediator().moveFloors();
        elevator.setFloorState(elevator.getFloor2State());
        System.out.println("*ding* The elevator arrives at Floor 2");
    }

    @Override
    public void press3() {
        System.out.println("Nothing happens");
    }
}
