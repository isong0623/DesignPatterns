package com.dreaming.design.solve.colleague.wrapper;

import com.dreaming.design.solve.mediator.wrapper.Mediator;

public abstract class Colleague {
    private Mediator mediator;
    public Colleague (Mediator mediator) {
        this.mediator = mediator;
    }
    public Mediator getMediator() {
        return mediator;
    }
}
