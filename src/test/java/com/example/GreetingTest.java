package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    @Test
    public void testHelloBasic() {
        Greeting greeting = new Greeting();
        assertEquals("Hello, World", greeting.sayHello("World"));
    }
}