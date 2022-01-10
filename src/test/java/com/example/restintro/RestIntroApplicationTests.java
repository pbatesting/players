package com.example.restintro;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
class RestIntroApplicationTests {

    @Test
    void dummyTest1() {
        assertEquals(5,5);
    }
    @Test
    void dummyTest2() {
        assertEquals(25,5*5);
    }

}
