package org.hillel.lesson8;

import org.junit.*;
import org.junit.Test;

/**
 * Created by yuriy on 08.12.15.
 */
public class LinkedListTest {

    LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void testSizeEmpty() {
        int size = linkedList.size();
        Assert.assertEquals("Expected size empty", 0, size);
    }

    @Test
    public void testSizeNotEmpty() {
        Integer first = 1;
        Integer second = 2;

        linkedList.add(first);
        linkedList.add(second);

        Assert.assertEquals(2, linkedList.size());
    }

    @Test
    public void testRemove() {
        Integer first = 1;
        Integer second = 2;

        linkedList.add(first);
        linkedList.add(second);
        boolean result = linkedList.remove(0);

        Assert.assertEquals(2, linkedList.size());
        Assert.assertFalse(result);
    }

}
