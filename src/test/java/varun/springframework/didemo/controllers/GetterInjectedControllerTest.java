package varun.springframework.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import varun.springframework.didemo.services.GreetingServiceImpl;

import static junit.framework.Assert.assertEquals;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_VARUN, getterInjectedController.sayHello());
    }
}