package varun.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_VARUN = "Hello Varun!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_VARUN;
    }
}
