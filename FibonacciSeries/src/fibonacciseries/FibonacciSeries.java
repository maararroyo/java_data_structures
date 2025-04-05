package fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;
        
        //0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610...
        
        System.out.print("How many terms do you want to see?: ");
        n = scanner.nextInt();
        
        //What if the user gives us a double?
        
        int a=0, b=1;
        
        System.out.print("Fibonacci Series: ");
        
        for (int i=0; i<n ; i++){
            System.out.print(a+ " ");
            int next = a+b;
            a=b;
            b=next;
        }   
    }
}
