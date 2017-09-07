package varun.springframework.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import varun.springframework.didemo.services.GreetingServiceImpl;

import static junit.framework.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_VARUN, constructorInjectedController.sayHello());
    }
}