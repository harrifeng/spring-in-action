package org.hfeng.tmp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    HelloWorld helloWorld;

    @Before
    public void before() throws Exception {
        helloWorld = new HelloWorld();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGetGreeting() {
        assertEquals("Hello World", helloWorld.getGreeting());
    }
}
