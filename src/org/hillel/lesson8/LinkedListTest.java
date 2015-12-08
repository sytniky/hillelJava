package org.hillel.lesson8;

import org.junit.*;
import org.junit.Test;

/**
 * Created by yuriy on 08.12.15.
 */
public class LinkedListTest {

    @BeforeClass
    public static void setUpClass() {
        // Выполняется только один раз
        System.out.println("setUpClass");
    }

    @Before
    public void setUp() {
        // Выполняется перед тестом, то есть подготовка теста
        System.out.println("setUp");
    }

    @Test
    public void testSizeEmpty() {
        System.out.println("Test1");
    }

    @Test
    public void testSizeNotEmpty() {
        System.out.println("Test2");
    }

    @After
    public void tearDown() {
        // Выполняется после каждого теста
        System.out.println("tearDown");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
}
