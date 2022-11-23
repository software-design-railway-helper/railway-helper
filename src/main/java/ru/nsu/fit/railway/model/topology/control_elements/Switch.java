package ru.nsu.fit.railway.model.topology.control_elements;

import ru.nsu.fit.railway.model.topology.TopologyElementStatus;
import ru.nsu.fit.railway.model.topology.Track;

public class Switch {

    // can't be changed under no circumstances
    private final SwitchStatic switchStatic;

    // can be changed only due to emergency
    private TopologyElementStatus switchStatus;

    // can (and probably will) be changed during the simulation
    private Track toTrack;

    public Switch(SwitchStatic switchStatic) {
        this.switchStatic = switchStatic;
    }
}
