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
        // TODO: reset movedFloors and ensure door is closed

    }

    @Override
    public void moveFloors() {
        // TODO: set movedFloors to true
    }

    @Override
    public void atNewFloor() {
        // TODO: return if we moved floors since start
    }

    @Override
    public void stop() {
        // TODO: try to open the door
    }
}
