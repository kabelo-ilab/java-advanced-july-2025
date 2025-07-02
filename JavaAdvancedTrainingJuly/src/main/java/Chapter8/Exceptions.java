package Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator, denominator;
        double quotient = 0;
        String name;

        try{
            System.out.print("Please enter your name: ");
            name = sc.next();
            System.out.print("Enter numerator: ");
            numerator = sc.nextInt();
            System.out.print("Enter denominator: ");
            denominator = sc.nextInt();

            quotient = numerator / denominator;

            System.out.println("Quotient: " + quotient);
            // K  a  b  e  l  o
            // K  a  t  e
            // 0  1  2  3  4  5
            System.out.println("The last letter of your name (" + name + ") is: " + name.substring(5));
        }catch (ArithmeticException ex){
            System.out.println("Error... Cannot divide by zero");
        }catch(InputMismatchException ex){
            System.out.println("Incorrect input");
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("The name should be at least 6 characters long");
        }




    }
}
