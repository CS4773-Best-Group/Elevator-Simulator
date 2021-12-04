package mediator;

public class ConcreteMediator implements Mediator {


    @Override
    public void registerElevator() {
        // TODO: register elevator to this mediator
    }

    @Override
    public void registerDoor() {
        // TODO: register door to this mediator
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
