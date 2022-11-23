package ru.nsu.fit.railway.model.topology.control_elements;

import ru.nsu.fit.railway.model.topology.Track;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatic {

    private final Track fromTrack;
    private final List<Track> toTracks;

    public SwitchStatic(Track fromTrack, List<Track> toTracks) {
        this.fromTrack = fromTrack;
        this.toTracks = new ArrayList<>(toTracks);
    }
}
