package main;

public class Node {
    Node next = null;
    Node successor = null;
    int data;

    public Node (int d ){
        data = d;
    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
        end.successor = n.next;
    }
}
