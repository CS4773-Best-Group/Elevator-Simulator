package mediator;

import colleagues.Door;
import colleagues.Elevator;

public interface Mediator {
    void registerElevator(Elevator elevator);
    void registerDoor(Door door);
    void start();
    void moveFloors();
    void atNewFloor();
    void stop();
}
