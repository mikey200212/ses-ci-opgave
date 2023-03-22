package org.example;
//import org.example.Calculator;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    Calculator calculator = new Calculator();

    class GetInputFromUser {


        public void main(String args[])
        {
            // Using Scanner for Getting Input from User
            Scanner in = new Scanner(System.in);


            //String s = in.nextLine();
            //System.out.println("You entered string " + s);

            int a = in.nextInt();
            int b = in.nextInt();
            int resultaat;
            resultaat=calculator.calculate(a,b);
            System.out.println(resultaat);

            //float b = in.nextFloat();
            //System.out.println("You entered float " + b);
        }

    }
}