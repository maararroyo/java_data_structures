//Count how many vowels has a word or phrase
package countvocales;

//read the word or phrase of the user
import java.util.Scanner;

public class CountVocales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write the word or phrase: ");
        String text = scanner.nextLine().toLowerCase();
        
        int counter = 0;
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                counter++;
            }
        }
        
        System.out.println("Number of vowels: "+counter);
        
    }
}
