package colleagues;

import floorstates.Floor1State;
import floorstates.Floor2State;
import floorstates.Floor3State;
import floorstates.FloorState;
import mediator.Mediator;

public class Elevator implements Colleague{
    private Mediator mediator;

    FloorState floor1State;
    FloorState floor2State;
    FloorState floor3State;

    FloorState floorState;

    public Elevator() {
        floor1State = new Floor1State(this);
        floor2State = new Floor2State(this);
        floor3State = new Floor3State(this);

        floorState = floor1State;
    }

    public void press1() {
        mediator.start();
        floorState.press1();
        mediator.stop();
    }

    public void press2() {
        mediator.start();
        floorState.press2();
        mediator.stop();
    }

    public void press3() {
        mediator.start();
        floorState.press3();
        mediator.stop();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setFloorState(FloorState floorState) {
        this.floorState = floorState;
    }

    public FloorState getFloor1State() {
        return floor1State;
    }

    public FloorState getFloor2State() {
        return floor2State;
    }

    public FloorState getFloor3State() {
        return floor3State;
    }
}
