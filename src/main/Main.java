package main;

import colleagues.Door;
import colleagues.Elevator;
import mediator.ConcreteMediator;
import mediator.Mediator;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Door door = new Door();

        Mediator mediator = new ConcreteMediator();
        mediator.registerElevator(elevator);
        mediator.registerDoor(door);

        elevator.press2();
        elevator.press1();
        elevator.press3();
        elevator.press3();
        elevator.press1();
    }
}
