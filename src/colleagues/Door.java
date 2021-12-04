package colleagues;

import mediator.Mediator;

public class Door implements Colleague {
    private Mediator mediator;

    boolean doorOpen;

    public Door() {
        this.doorOpen = true;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void closeDoor() {
        if (doorOpen)
            doorOpen = false;
    }

    public void openDoor() {
        if (mediator.atNewFloor())
            doorOpen = true;
    }
}
