package test;

import main.MyStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class stackTests {

    @Test
    public void myStackPeek() {
        MyStack myStack = new MyStack();
        myStack.push(33);
        assertEquals(myStack.peek(), 33);

    }

    @Test
    public void myStackMin() throws Exception {
        MyStack myStack = new MyStack();
        myStack.push(3);
        myStack.push(5);
        myStack.push(2);
        myStack.push(7);
        assertEquals(myStack.peek(), 7);
        assertEquals(myStack.getMin(), 2);
        assertEquals(myStack.pop(), 7);
        assertEquals(myStack.pop(), 2);
        assertEquals(myStack.getMin(), 3);
    }

}
