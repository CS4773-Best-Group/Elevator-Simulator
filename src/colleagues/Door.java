package colleagues;

import mediator.Mediator;

public class Door implements Colleague {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // TODO: implement opening and closing the door
}
