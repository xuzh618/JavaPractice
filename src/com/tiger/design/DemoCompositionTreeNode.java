package com.tiger.design;

import sun.lwawt.macosx.CSystemTray;

import java.util.Enumeration;
import java.util.Vector;

/**
 * tree structure
 */
public class DemoCompositionTreeNode {

    private String name;
    private DemoCompositionTreeNode parent;
    private Vector<DemoCompositionTreeNode> children = new Vector<DemoCompositionTreeNode>();

    public DemoCompositionTreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DemoCompositionTreeNode getParent() {
        return parent;
    }

    public void setParent(DemoCompositionTreeNode parent) {
        this.parent = parent;
    }

    public void setChildren(Vector<DemoCompositionTreeNode> children) {
        this.children = children;
    }

    //add leaf node
    public void addChild(DemoCompositionTreeNode child) {
        children.add(child);
    }

    //del leaf node
    public void removeChild(DemoCompositionTreeNode child) {
        children.remove(child);
    }

    // get leaf node
    public Enumeration<DemoCompositionTreeNode> getChildren() {

        return children.elements();
    }

    public static void main(String[] args) {
        DemoCompositionTreeNode root = new DemoCompositionTreeNode("A");
        DemoCompositionTreeNode nodeB = new DemoCompositionTreeNode("B");
        DemoCompositionTreeNode nodeC = new DemoCompositionTreeNode("c");

        nodeB.addChild(nodeC);
        root.addChild(nodeB);
        System.out.println("build the tree in composition!");
    }

}
