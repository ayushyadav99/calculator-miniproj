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
            System.out.println("2. Exit");

            int option = in.nextInt();
            switch(option){
                case 1:
                    System.out.println("Input the operand");
                    double operand = in.nextDouble();
                    System.out.println("The Square root of " + operand + " is " + sqrt(operand));
                    break;
                case 2:
                    run_flag = 0;
                default:
                    System.out.println("Invalid Command: Please Try Again");
            }
        }while(run_flag == 1);
    }

    private static final Logger logger = LogManager.getLogger(App.class);

    static double sqrt(double operand){
        logger.info("Applying square root function on operand : " + operand);
        return Math.sqrt(operand);
    }
}
