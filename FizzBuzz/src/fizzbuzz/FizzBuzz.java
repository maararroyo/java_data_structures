
package fizzbuzz;

/*
Given a number n, for each integer i in the range from 1 to n inclusive, print 
one value per line as follows:

- If is a multipple of both 3 and 5, print FizzBuzz
- If is a multiple of 3 (but not 5), print Fizz
-if is a multiple of 5(but not 3), print Buzz
- If is not a multiple of 3 or 5, print the value of i

*/

//to read users numbers
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        //declare the object
        Scanner scanner = new Scanner(System.in);
        
        /*
        Here we are mitigating the problem that: what happens if the user gives 
        us a large number
        */
        System.out.println("Enter a enter number: ");
        if (!scanner.hasNextInt()){
            System.out.println("ERROR: You must enter a whole number, not a decirmal or text");
            return;
        }
        
        int n = scanner.nextInt();
        
        if (n<=0){
            System.out.println("ERROR: The number must be greater than zero");
            return;
        }
        
        //4 cases:
        for (int i=1; i<=n; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0){
                System.out.println("Fizz");
            }else if (i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
        
        //complexity: O(n) 1-n
    }
}
