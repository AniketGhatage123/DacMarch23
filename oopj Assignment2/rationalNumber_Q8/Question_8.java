
import java.util.Scanner;
class RationalNumber{
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public static void performOperation(RationalNumber num1, RationalNumber num2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation to be performed\n1. +\n2. -\n3. *\n4. /\n5. %\n6.Exit");
        int operation = sc.nextInt();
        while(operation != 6){
            if(operation==1){
                double res = ((double)num1.numerator / num1.denominator) + ((double)num2.numerator / num2.denominator);
                System.out.printf("Result: %.2f",res);break;
            }
            else if(operation==2){
                double res = ((double)num1.numerator / num1.denominator) - ((double)num2.numerator / num2.denominator);
                System.out.printf("Result: %.2f",res);break;
            }
            else if(operation==3){
                double res = ((double)num1.numerator / num1.denominator) * ((double)num2.numerator / num2.denominator);
                System.out.printf("Result: %.2f",res);break;
            }
            else if(operation==4){
                double res = ((double)num1.numerator / num1.denominator) / ((double)num2.numerator / num2.denominator);
                System.out.printf("Result: %.2f",res);break;
            }
            else if(operation==5){
                double res = ((double)num1.numerator / num1.denominator) % ((double)num2.numerator / num2.denominator);
                System.out.printf("Result: %.2f",res);break;
            }
            else{
                System.out.println("Invalid choice!");break;
            }
        }

    }
}

public class Question_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first rational number:");
        System.out.print("Numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Denominator: ");
        int denominator = sc.nextInt();
        RationalNumber num1 = new RationalNumber(numerator, denominator);
        System.out.println("Enter second rational number:");
        System.out.print("Numerator: ");
        numerator = sc.nextInt();
        System.out.print("Denominator: ");
        denominator = sc.nextInt();
        RationalNumber num2 = new RationalNumber(numerator, denominator);
        RationalNumber.performOperation(num1, num2);
        
    }
}
