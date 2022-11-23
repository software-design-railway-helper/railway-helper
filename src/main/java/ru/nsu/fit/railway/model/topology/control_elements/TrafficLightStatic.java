package ru.nsu.fit.railway.model.topology.control_elements;

import ru.nsu.fit.railway.model.topology.Track;

public class TrafficLightStatic {

    private final Track fromTrack;
    private final Track toTrack;

    public TrafficLightStatic(Track fromTrack, Track toTrack) {
        this.fromTrack = fromTrack;
        this.toTrack = toTrack;
    }
}
