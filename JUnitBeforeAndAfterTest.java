package com.javafortesters.junit;

import org.junit.*;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class JUnitBeforeAndAfterTest {

    @BeforeClass
    public static void PoKlasie(){
        System.out.println("po klasie");
    }

    @Before
    public void PrzedTestem() {
        System.out.println("dupa");
    }

    @Test
    public void Test1() {

        assertTrue("good", true);
    }

    @Test
    public void Test2() {

        assertFalse("1", false);
    }

    @Test
    public void Test3() {
        assertEquals(3, 2 + 1);
    }

    @Test
    public void Test4() {
        assertThat("d", is(not("dk")));

    }

    @Test
    public void Test5() {
        assertThat("nie sa rowne", 5, is(5));
    }

    @After
    public void PoTescie() {
        System.out.println("po tescie");


    }

}