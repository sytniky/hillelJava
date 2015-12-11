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

        result = linkedList.remove(1);
        Assert.assertTrue(result);
        Assert.assertEquals(1, linkedList.size());

        result = linkedList.remove(2);
        Assert.assertTrue(result);
        Assert.assertEquals(0, linkedList.size());
    }

    @Test
    public void testContains() {
        Integer first = 1;
        Integer second = 2;

        linkedList.add(first);
        linkedList.add(second);

        boolean result = linkedList.contains(1);
        Assert.assertTrue("Expected contains() returns true", result);

        result = linkedList.contains(10);
        Assert.assertFalse("Expected contains() returns false", result);
    }

    @Test
    public void testToArray() {
        Integer first = 1;
        Integer second = 2;

        linkedList.add(first);
        linkedList.add(second);

        Assert.assertArrayEquals(new Object[]{1, 2}, linkedList.toArray());
    }

}
