package mediator;

import colleagues.Door;
import colleagues.Elevator;

public class ConcreteMediator implements Mediator {
    Elevator elevator;
    Door door;

    boolean movedFloors;

    @Override
    public void registerElevator(Elevator elevator) {
        elevator.setMediator(this);
        this.elevator = elevator;
    }

    @Override
    public void registerDoor(Door door) {
        door.setMediator(this);
        this.door = door;
    }

    @Override
    public void start() {
        movedFloors = false;
        // TODO: close the door if necessary
    }

    @Override
    public void moveFloors() {
        movedFloors = true;
    }

    @Override
    public boolean atNewFloor() {
        return movedFloors;
    }

    @Override
    public void stop() {
        // TODO: try to open the door
    }
}
