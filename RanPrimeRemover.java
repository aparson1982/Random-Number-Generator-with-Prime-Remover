
/**
 * Write a description of class na here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class RanPrimeRemover {
    private LinkedList<Integer> Values2;
    //creates new LinkedList
    public RanPrimeRemover(LinkedList<Integer> initiaValues2)
    {
        Values2 = new LinkedList<Integer>(initiaValues2);
    }
    
    //if number is prime then it is removed
    public void checkPrime()
    {
    for (int i = 0; i<= Values2.size()-1; i++)
        {
            if (isPrime(Values2.get(i)))
            {
                Values2.remove(i);
            }
        }
    }
    
    //checks if int is prime
    public static boolean isPrime(int number) {
        for (int j = 2 ; j < number ; j++) {
            if (number % j == 0) {
                return false; // number is divisible so its not prime
            }
        }
        return true; // number is prime now
    }
    //main method
    public static void main(String[] args) {
        Random RandomNum = new Random();  //instantiates RandomNum
        final int SIZE = 20;  //sets limit of random numbers to 20
        LinkedList<Integer> Values1 = new LinkedList<Integer>();  //creates empty list of integers called Values1
        
        //for loop generates 20 random numbers between 0 and 100
        for(int i=0; i<SIZE; i++)
        {
            Values1.add(1+RandomNum.nextInt(100));
        }
        
        //shows initial list of random numbers
        System.out.println("Initial Random Number List:  ");
        System.out.println(Values1);
        System.out.println();
        
        RanPrimeRemover PriMove = new RanPrimeRemover(Values1);
        
        //shows new list with prime numbers removed
        PriMove.checkPrime();
        System.out.println("Prime Numbers Removed: ");
        System.out.println(PriMove.Values2);
        System.out.println();
        
    }
    
}
