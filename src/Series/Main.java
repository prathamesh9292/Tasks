package Series;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prime isPrime = new Prime();
        Fibonacci fib = new Fibonacci();
        Square isSquare = new Square();

        Scanner input = new Scanner(System.in);

        int n;

        do
        {
            System.out.println(" 0 to exit  \n Enter a number ");
            n = input.nextInt();
            isPrime.prime(n);
            fib.fibonacci(n);
            isSquare.square(n);
        }
        while(n>0);
    }
}
