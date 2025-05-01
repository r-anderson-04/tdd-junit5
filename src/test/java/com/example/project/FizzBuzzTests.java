package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTests {
    

    @Test
    public void isFizzTest() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(true, fb.isFizz(3));
    }

    @Test
    public void isBuzzTest() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(true, fb.isBuzz(5));
    }

    @Test
    public void isFizzBuzzTest() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(true, fb.isFizzBuzz(15));
    }
    
}