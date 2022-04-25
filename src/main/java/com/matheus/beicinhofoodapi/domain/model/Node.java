package com.matheus.beicinhofoodapi.domain.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node {
    private static int generatedId = 1;
    private int id;

    private Object data;
    private List<Node> children = new LinkedList<>();
    private Node previous;

    private boolean lock = false;

    public Node(Object data){
        this.id = generatedId++;
        this.data = data;
    }

    public void addChild(Node child){
        children.add(child);
    }

    public List<Node> getChildren(){
        return this.children;
    }

    public void setPrevious(Node previous){
        if(!lock) {
            this.previous = previous;
            lock = true;
        }
    }

    public Node getPrevious(){
        return this.previous;
    }

    public int getId(){
        return this.id;
    }

    public Object getData(){
        return this.data;
    }
}
