package colleagues;

import mediator.Mediator;

public class Elevator implements Colleague{
    private Mediator mediator;

    // TODO: create instance variables for all the floor states

    public Elevator() {
        // TODO: set initial floor
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // TODO: implement button pressing

}
