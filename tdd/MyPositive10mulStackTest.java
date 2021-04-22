package com.example;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MyPositive10mulStackTest {

    // positive flows

    //    void push(int item);
    //    int pop();
    //    int peek();
    //    void clear();
    //    int count();

    // atomic test
    @Test
    public void test_MyPositive10mulStack_push_pos1()
    {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        stack.push(10);

        // non atomic
        assertEquals(stack.count(), 1);
        assertEquals(stack.peek(), 10);

        // atomic
        // how to check the push without using the interface!
    }


    // negative flows

}
