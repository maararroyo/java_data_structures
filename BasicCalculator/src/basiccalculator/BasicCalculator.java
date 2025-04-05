
package basiccalculator;

//to read users numbers:
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
      
        //declar the object
        Scanner scanner = new Scanner(System.in);
        
        double num1, num2;
        char operation;
        double answer;
        
        System.out.print("Write the first number: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Write the second number: ");
        num2 = scanner.nextDouble();
        
        System.out.print("Write the operation (+, -, *, / ): ");
        operation = scanner.next().charAt(0); //read the firt character
        
        switch(operation){
            case '+':
                answer = num1+num2;
                System.out.println("Answer: "+ answer);
                break;
            case '-':
                answer = num1-num2;
                System.out.println("Answer: "+ answer);
                break;
            case '*':
                answer = num1*num2;
                System.out.println("Answer: "+ answer);
                break;
            case '/':
                if (num2 != 0){
                    answer = num1/num2;
                    System.out.println("Answer: "+ answer);
                }else{
                    System.out.println("ERROR: You can't divide 0");
                }
                break;
            default:
                System.out.println("Operación inválida.");
        }
    }
}
