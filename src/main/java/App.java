import java.lang.Math;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    public static void main(String[] args) {
        int run_flag = 1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Enter the number corresponding to the operation you want to execute: ");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");

            int option = in.nextInt();
            switch(option){
                case 1: {
                    System.out.println("Input the operand");
                    double operand = in.nextDouble();
                    System.out.println("The Square root of " + operand + " is " + sqrt(operand));
                    break;
                }
                case 2: {
                    System.out.println("Input the operand");
                    int operand = in.nextInt();
                    System.out.println("The Factorial of " + operand + " is " + factorial(operand));
                    break;
                }
                case 3: {
                    System.out.println("Input the operand");
                    double operand = in.nextDouble();
                    System.out.println("The natural log of " + operand + " is " + nLog(operand));
                    break;
                }
                case 4: {
                    System.out.println("Input the base value");
                    double operandX = in.nextDouble();
                    System.out.println("Input the exponent value");
                    double operandY = in.nextDouble();
                    System.out.println("The value of " + operandX + " raised to the power of " + operandY + " is " + power(operandX, operandY));
                    break;
                }
                case 5: {
                    run_flag = 0;
                    System.out.println("Exiting now, thanks. :)");
                    break;
                }
                default:
                    System.out.println("Invalid Command: Please Try Again");
            }
        }while(run_flag == 1);
    }

    private static final Logger logger = LogManager.getLogger(App.class);

    static double sqrt(double operand){
        logger.info("Applying square root function on operand : " + operand);
        double out = Math.sqrt(operand);
        logger.info("Result of square root function on " + operand + " is: " + out);
        return out;
    }

    static int factorial(int operand){
        logger.info("Applying factorial function on operand : " + operand);
        int out = 1;
        for(int i=operand; i>0; i--){
            out *=i;
        }
        logger.info("Result of factorial function on " + operand + " is: " + out);
        return out;
    }

    static double nLog(double operand){
        logger.info("Applying natural log function on operand : " + operand);
        double out = Math.log(operand);
        logger.info("Result of natural log function on " + operand + " is: " + out);
        return out;
    }

    static double power(double operandX, double operandY){
        logger.info("Applying power function on : " + operandX + ", " + operandY);
        double out = Math.pow(operandX, operandY);
        logger.info("Result of power function on : " + operandX + ", " + operandY + " is: " + out);
        return out;
    }
}
