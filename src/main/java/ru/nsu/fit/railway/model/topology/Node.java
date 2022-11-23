package ru.nsu.fit.railway.model.topology;


public class Node {

    // can't be changed under no circumstances
    private final NodeStatic nodeStatic;

    // can be changed only due to emergency
    private TopologyElementStatus nodeStatus;
    private boolean isInput;
    private boolean isOutput;

    public Node(NodeStatic nodeStatic) {
        this.nodeStatic = nodeStatic;
    }
}
