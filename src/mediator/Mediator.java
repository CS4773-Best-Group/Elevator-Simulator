package mediator;

public interface Mediator {
    void registerElevator();
    void registerDoor();
    void start();
    void moveFloors();
    void atNewFloor();
    void stop();
}
