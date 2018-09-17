//Write down a program to print the 10th fibonacci number
package javaapplication3;

class Fibonacci{
    private int First=0;
    private int Second=1;
    private int Fib;
    public void printFibonacci(){
        for (int i = 0; i < 8; i++) {
            Fib = First+Second;
            First = Second;
            Second = Fib;
        }
        //To print the Specific fibonacci number.
        System.out.println("Specific fibonacci number: "+Fib);
    }
}
public class JavaApplication3 {
    public static void main(String[] args) {
        Fibonacci objFib = new Fibonacci();
        objFib.printFibonacci();
    }
}
