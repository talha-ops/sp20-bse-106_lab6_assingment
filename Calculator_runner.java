package lab6_assign;
import java.util.Scanner;
public class Calculator_runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, angle;
        System.out.print("Enter two numbers by spacing: ");
        number1 =input.nextDouble();
        number2 =input.nextDouble();
        System.out.println(number1 + " + " + number2 + " =: " + Lab6_Assign.sum(number1,number2));
        System.out.println(number1 + " x " + number2 + " =: " + Lab6_Assign.multiply(number1,number2));
        System.out.println(number1 + " / " + number2 + " =: " + Lab6_Assign.divide(number1,number2));
        System.out.println(number1 + " % " + number2 + " =: " + Lab6_Assign.modulus(number1,number2));
        System.out.print("Enter the angle you want to check trignometric ratios: ");
        angle =input.nextDouble();
        System.out.println("sin of " + angle + " =: " + Lab6_Assign.sin(angle));
        System.out.println("cos of " + angle + " =: " + Lab6_Assign.cos(angle));
        System.out.println("tan of " + angle + " =: " + Lab6_Assign.tan(angle));
        input.close();
    }
}