package com.bc2307;


import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.Assertions;
// import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default

public class AppTest {

    private int x;

    @Test
    void testAddMethod() {
        // Assertions.assertEquals(actual value, expected value);
        assertEquals(5, App.add(2, 3));
        assertEquals(7, App.add(2, 5));
        assertEquals(-4, App.add(-2, -2));
        x++;
        assertEquals(1, x);
    }

    @Test
    void testNotEquals() {
        assertNotEquals(-10, App.add(-2, -2));
        x++;
        assertEquals(1, x);
    }

    //Demo -- mvn test
    public static void main(String[] args) {
        AppTest t1 = new AppTest();
        t1.testAddMethod();
        AppTest t2 = new AppTest();
        t2.testNotEquals();
    }
}
