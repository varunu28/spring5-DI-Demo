package varun.springframework.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import varun.springframework.didemo.services.GreetingServiceImpl;

import static junit.framework.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_VARUN, propertyInjectedController.sayHello());
    }
}
