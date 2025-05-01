package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.framework.TestCase;

public class FizzBuzzTests extends TestCase{
    

    @Test
    public void isFizzTest() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(true, isFizz(3));
    }

    @Test
    public void isBuzzTest() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(true, isBuzz(5));
    }
    
}