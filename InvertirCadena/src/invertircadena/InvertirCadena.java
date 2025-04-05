//Invertir cadena
package invertircadena;

//read the users word
import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Write a word");
    String text = scanner.nextLine().toLowerCase();
    
    String inverted = "";
    
    for (int i=text.length()-1; i>=0; i--){
        inverted += text.charAt(i);
    }
    
    System.out.println("The inverted word is: "+inverted);
    
    }
    
}
