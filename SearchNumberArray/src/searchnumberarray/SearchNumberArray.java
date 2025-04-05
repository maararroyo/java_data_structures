
package searchnumberarray;

//for the user
import java.util.Scanner;

public class SearchNumberArray {

    public static void main(String[] args) {
        //declare object
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many numbers want to write?: ");
        int n = scanner.nextInt();
        int [] nums=new int[n];
        
        System.out.println("Write the "+n+" numbers: ");
        for (int i=0; i<n; i++){
            nums[i]=scanner.nextInt();
        }
        
        System.out.println("Which number you want to searh?: ");
        int searching = scanner.nextInt();
        boolean found = false;
        
        for (int num:nums){
            if (num == searching){
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("El número " + searching + " está en el arreglo.");
        } else {
            System.out.println("El número no fue encontrado.");
        }
        
    }
    
}
