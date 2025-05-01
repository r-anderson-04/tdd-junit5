package com.example.project;

public class FizzBuzz {

    public boolean isFizz(int n) {
        if(n%3 == 0) return true;
        
        return false;
    }

    public boolean isBuzz(int m) {
        if(m%5 == 0)    return true;

        return false;
    }

    public boolean isFizzBuzz(int p) {
        if(isFizz(p) && isBuzz(p))  return true;

        return false;
    }
    
}