package primenumbers;

//to have the user numbers
import java.util.Scanner;

/*
Just to remember:
A prime number >1 divisores entre sí mismo y 1
*/
public class PrimeNumbers {

    public static void main(String[] args) {
        
        //declare the object
        Scanner scanner = new Scanner(System.in);
        
        int num;
        
        System.out.print("Write a number: ");
        num = scanner.nextInt();
        
        boolean esPrimo = true;
        
        if (num <= 1){
            esPrimo = false;
        } else {
            for (int i=2; i<=Math.sqrt(num); i++){
                if (num % i==0){
                    esPrimo=false;
                    break;
                }
            }
        }
        
        if (esPrimo){
            System.out.print(num+" es primo");
        }else{
            System.out.print(num+ " no es primotext ");
        }
   
    }
    
}
