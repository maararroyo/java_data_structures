/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlearea;

/**
 *
 * @author maria
 */
//read the ratio that the user gives us
import java.util.Scanner;

public class CircleArea {
    
    public static void main(String[] args) {
        
        //create the object
        Scanner scanner = new Scanner(System.in);
        
        //declare varible
        double radius;
        double area;
        double perimeter;
        
        
        System.out.print("Write the ratio of the circle: ");
        radius = scanner.nextDouble();
        
        area = Math.PI*radius*radius;
        perimeter = Math.PI*2*radius;
        //area= Math.pow(radius, 2);
        
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}
