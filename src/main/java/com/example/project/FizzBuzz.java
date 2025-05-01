package com.example.project;

public class FizzBuzz {

    static FizzBuzz fb = new FizzBuzz();

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

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++)
        {
            if (fb.isFizzBuzz(i))
            {
                System.out.println("FizzBuzz");
            }
            else if (fb.isFizz(i)) {
                System.out.println("Fizz");
            } 
            else if (fb.isBuzz(i)) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
    
}