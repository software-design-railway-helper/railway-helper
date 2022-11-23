package ru.nsu.fit.railway.model.topology;

import ru.nsu.fit.railway.model.TrainType;

import java.util.ArrayList;
import java.util.List;

public class Track {

    // can't be changed under no circumstances
    private final TrackStatic trackStatic;

    // can be changed only due to emergency
    private List<TrainType> canServe;
    private TopologyElementStatus trackStatus;

    // can (and probably will) be changed during the simulation
    private int freeSpace;

    public Track(TrackStatic trackStatic) {
        this.trackStatic = trackStatic;
        this.canServe = new ArrayList<>();
        this.freeSpace = trackStatic.getLength();
    }

    public TrackStatic getTrackStatic() {
        return trackStatic;
    }
}
