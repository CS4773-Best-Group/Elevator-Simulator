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
        floor1State = new Floor1State();
        floor2State = new Floor2State();
        floor3State = new Floor3State();

        floorState = floor1State;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setFloorState(FloorState floorState) {
        this.floorState = floorState;
    }

    public void press1() {
        floorState.press1();
    }

    public void press2() {
        floorState.press2();
    }

    public void press3() {
        floorState.press3();
    }
}
