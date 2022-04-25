package com.matheus.beicinhofoodapi.domain.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class GraphBFS {

    private static HashMap<Integer, Node> nodes = new HashMap<>();


    public static void main(String[] args) {

        createNodes();
        Node source = getNode(3);
        source.setPrevious(new Node("nullable"));
        Node destination = getNode(20);

        boolean result = searchPath(source, destination);
        System.out.println(result);

    }

    public static boolean searchPath(Node source, Node destination){
        if (source == destination) return true;

        LinkedList<Node> currentlyVisiting = new LinkedList<>();
        HashSet<Integer> visitedNodes = new HashSet<>();

        for(Node child : source.getChildren()) {
            currentlyVisiting.add(child);
            child.setPrevious(source);
        }
        
        while(!currentlyVisiting.isEmpty()){
            Node current = currentlyVisiting.remove();
            if(visitedNodes.contains(current.getId())) continue;

            if(current == destination) {
                while(current.getPrevious() != null){
                    System.out.println(current.getData());
                    current = current.getPrevious();}
                return true;}

            visitedNodes.add(current.getId());

            for(Node child : current.getChildren()) {
                currentlyVisiting.add(child);
                child.setPrevious(current);}}
        return false;
    }

    public static Node getNode(int id){
        return nodes.get(id);
    }

    public static void createNodes(){
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        Node h = new Node("h");
        Node i = new Node("i");
        Node j = new Node("j");
        Node k = new Node("k");
        Node l = new Node("l");
        Node m = new Node("m");
        Node n = new Node("n");
        Node o = new Node("o");
        Node p = new Node("p");
        Node q = new Node("q");
        Node r = new Node("r");
        Node s = new Node("s");
        Node t = new Node("t");

        for (Node node : Arrays.asList(b, h)) {
            a.addChild(node);
        }

        for (Node node : Arrays.asList(a, c)) {
            b.addChild(node);
        }

        for (Node node : Arrays.asList(b, d, h)) {
            c.addChild(node);
        }

        for (Node node : Arrays.asList(c, e)) {
            d.addChild(node);
        }

        for (Node node : Arrays.asList(d, f)) {
            e.addChild(node);
        }

        for (Node node : Arrays.asList(e, g)) {
            f.addChild(node);
        }

        for (Node node : Arrays.asList(f, j)) {
            g.addChild(node);
        }

        for (Node node : Arrays.asList(a, c, i, k)) {
            h.addChild(node);
        }

        for (Node node : Arrays.asList(h, j, l)) {
            i.addChild(node);
        }

        for (Node node : Arrays.asList(g, i, l)) {
            j.addChild(node);
        }

        for (Node node : Arrays.asList(h, m)) {
            k.addChild(node);
        }

        for (Node node : Arrays.asList(i, j, m)) {
            l.addChild(node);
        }

        for (Node node : Arrays.asList(k, l, n, o)) {
            m.addChild(node);
        }

        n.addChild(m);

        for (Node node : Arrays.asList(m, p, r)) {
            o.addChild(node);
        }

        for (Node node : Arrays.asList(o, q)) {
            p.addChild(node);
        }

        q.addChild(p);

        for (Node node : Arrays.asList(o, s)) {
            r.addChild(node);
        }

        for (Node node : Arrays.asList(r, t)) {
            s.addChild(node);
        }

        t.addChild(s);

        nodes.put(a.getId(), a);
        nodes.put(b.getId(), b);
        nodes.put(c.getId(), c);
        nodes.put(d.getId(), d);
        nodes.put(e.getId(), e);
        nodes.put(f.getId(), f);
        nodes.put(g.getId(), g);
        nodes.put(h.getId(), h);
        nodes.put(i.getId(), i);
        nodes.put(j.getId(), j);
        nodes.put(k.getId(), k);
        nodes.put(l.getId(), l);
        nodes.put(m.getId(), m);
        nodes.put(n.getId(), n);
        nodes.put(o.getId(), o);
        nodes.put(p.getId(), p);
        nodes.put(q.getId(), q);
        nodes.put(r.getId(), r);
        nodes.put(s.getId(), s);
        nodes.put(t.getId(), t);

    }
}
