//Write down a program to print the first 10 fibonacci number
package javaapplication3;

class Fibonacci{
    private int First=0;
    private int Second=1;
    private int Fib;
    public void printFibonacci(){
        //To print the first two fibonacci number either 0,1 or 1,1.
        System.out.print(First+" "+Second);
        for (int i = 0; i < 8; i++) {
            Fib = First+Second;
            System.out.print(" "+Fib);
            First = Second;
            Second = Fib;
        }
        //To print the last fibonacci number in the series
        Fib = First+Second;
        System.out.println();
    }
}
//By default in a fibonacci series the First and Second number will be set either 0,1 or 1,1. Rest of the 
//number will be produce from these two numbers. 
public class JavaApplication3 {
    public static void main(String[] args) {
        Fibonacci objFib = new Fibonacci();
        objFib.printFibonacci();
    }
}
