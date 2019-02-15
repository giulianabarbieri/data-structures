package main;

public class MyStack {
    Node top;
    Node min;

    public void push(int d) {
        Node n = new Node(d);
        if (min == null) {
            min = n;
            top = n;
        }
        if (d <= min.data) {
            Node auxmin = min;
            min = n;
            min.successor = auxmin;
        }
        Node aux = top;
        top = n;
        top.next = aux;
    }

    public Object pop() throws Exception {
        if (top == null) {
            throw new Exception("main.main.MyStack is empty");
        }
        if (top == min) {
            min = min.successor;
        }
        Node aux = top;
        top = top.next;
        return aux.data;
    }

    public Object peek() {
        return top.data;
    }

    public Object getMin() {
        return min.data;
    }
}

