/*
Revisar si una palabra se lee igual al derecho y al revés (como “oso” o “reconocer”).
*/
package palindromo;

//to read users word
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        
        //declare objects and varible
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reversed = "";
        
        System.out.println("Write a word: ");
        
        for (int i=word.length(); i>=0; i++){
            reversed += word.charAt(i);
        }
    }
    
}
