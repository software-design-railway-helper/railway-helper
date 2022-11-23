package ru.nsu.fit.railway.model.topology.control_elements;

import ru.nsu.fit.railway.model.topology.TopologyElementStatus;

public class TrafficLight {

    // can't be changed under no circumstances
    private final TrafficLightStatic trafficLightStatic;

    // can be changed only due to emergency
    private TopologyElementStatus trafficLightStatus;

    // can (and probably will) be changed during the simulation
    private TrafficLightState trafficLightState;

    public TrafficLight(TrafficLightStatic trafficLightStatic) {
        this.trafficLightStatic = trafficLightStatic;
    }
}
