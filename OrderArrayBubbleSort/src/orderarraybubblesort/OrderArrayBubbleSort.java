//read 5 numbers, ordenarlos en ordes ascendente
package orderarraybubblesort;
//read usesrs numbers
import java.util.Scanner;

public class OrderArrayBubbleSort {

    public static void main(String[] args) {
       //declare object and varibles
       Scanner scanner = new Scanner(System.in);
       int[] numbers = new int[5];
       
        System.out.println("Write 5 numbers: ");
        for (int i=0; i<5; i++){
            System.out.print("Number "+(i+1)+": ");
            numbers[i]=scanner.nextInt();
        }
        
        //BubbleSort method
        for(int i=0; i<numbers.length-1; i++){
            for(int j=0; j<numbers.length-1-i;j++){
                if (numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        
        System.out.println("Números ordenados:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        
    }
    
    
}
