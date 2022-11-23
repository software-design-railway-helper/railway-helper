package ru.nsu.fit.railway.model.topology;

import ru.nsu.fit.railway.model.topology.control_elements.Switch;
import ru.nsu.fit.railway.model.topology.control_elements.TrafficLight;

import java.util.List;

public class NodeStatic {

    private final List<Track> leftTracks;
    private final List<Track> rightTracks;
    private final List<Switch> associatedSwitches;
    private final List<TrafficLight> associatedTrafficLights;

    public NodeStatic(List<Track> leftTracks, List<Track> rightTracks, List<Switch> associatedSwitches, List<TrafficLight> associatedTrafficLights) {
        this.leftTracks = leftTracks;
        this.rightTracks = rightTracks;
        this.associatedSwitches = associatedSwitches;
        this.associatedTrafficLights = associatedTrafficLights;
    }
}
