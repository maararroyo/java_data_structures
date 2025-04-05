/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetwonumbers;

/**
 *
 * @author maria
 */
//read the users request
import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args) {
        
        //Create the object
        Scanner scanner = new Scanner(System.in);
        
        //declare varible
        int number1;
        int number2;
        
        System.out.print("Write the fisrt number");
        number1 = scanner.nextInt();
        
        System.out.print("Write the second number");
        number2 = scanner.nextInt();
        
        if (number1 == number2){
            System.out.println(number1+ "equals "+number2);
        } 
        else if (number1>number2){
                    System.out.print(number1+" is greater than "+ number2);
        }else{
            System.out.print(number1+ " is less than " +number2);
            }
        }
}
