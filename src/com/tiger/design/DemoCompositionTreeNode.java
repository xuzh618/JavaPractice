package com.tiger.design;

import java.util.Enumeration;
import java.util.Vector;

/**
 * tree structure
 *
 * 回到正题，组合模式中当然在组合对象中含有被组合对象的引用，只是不同的是，
 * 组合模式在概念上更加严格，通常是指引用的被组合对象类型就是组合对象的类型。
 * 如此一来，使得组合对象和被组合对象处理起来具有一致性。当然，前提是组合被
 * 对象和被组合对象在本身的概念层次上具有此一致性。
 * 参考：https://www.cnblogs.com/lwbqqyumidi/p/3758182.html
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
