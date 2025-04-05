
package keywordsuggestion;

/*
Amazon is buildng a way to help custumers search reviews quicker by providing 
real-time suggestions to search tearms when the customer starts typing. When 
given a minimum of 2 characters into the search field the system will suggest at 
most 3 keywords from the review word repository. As he customer continues to 
type in reviews search bar, the relevant keyword will update automatically.

Write an algorithm that will output a maximum of 3 keyword suggestion after each
character is typed by the costumer in the search field.

If there are more than 3 acceptable keywords, return the keywords that are first 
in alphabetical order.
Only return keyword suggestions after the customer has entered 2 characters
Keyword suggestions must start with the characters already typed
Both the repository and the customerQuery should be compared in a case-insensitive

INPUT:
The input to the method/function consists of two arguments:
repository: a list of unique strings representing the various keywords from the 
            Amazon review comment section
customerQuery: a string representing a full search query of the costumer

OUTPUT:
Return a list of strings in lower case, where each list represents the keyword 
suggestions made by the system as the customer types each character of the 
customerQuery. Assume the customer types characters in prder without deleting or
removinf any characters. If an output is not possible, return an empty array[]

EXAMPLE:
Input:
repostory = {"mobile", "mouse", "moneypot", "mousepad"}
customerQuery= "mouose"

Output:
["mobile", "moneypot", "monitor"]
["mouse" ,"mousepad"]
["mouse" ,"mousepad"]
["mouse" ,"mousepad"]
*/

import java.util.*;
/*
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
*/

public class KeyWordSuggestion  {

    public static List<List<String>> getSuggestions(List<String> repository, String customerQuery) {
        //final list where we are going to keep suggestions
        List<List<String>> result = new ArrayList<>();

        if (repository == null || customerQuery == null || customerQuery.length() < 2) {
            return result;
        }

        // Normalize each word on the repository to lowercase
        List<String> lowerRepo = new ArrayList<>();
        /*
        for (int i = 0; i < repository.size(); i++) {
            String word = repository.get(i);
            ...
        }
        */
        for (String word : repository) {
            lowerRepo.add(word.toLowerCase());
        }

        // Sort alphabetically
        Collections.sort(lowerRepo);

        // Normalize customer query
        String query = customerQuery.toLowerCase();

        for (int i = 2; i <= query.length(); i++) {
            //let's take the first two characters
            String prefix = query.substring(0, i);
            //Create a sublist for autocompleting
            List<String> suggestions = new ArrayList<>();
            
            //search in repository evry word that starts with prefix
            for (String word : lowerRepo) {
                if (word.startsWith(prefix)) {
                    //if concide, agregate
                    suggestions.add(word);
                }
                if (suggestions.size() == 3) {
                    break; // break the cicle to spear time
                }
            }

            result.add(suggestions);
            //agregate the suggestions to this period to the final result
        }

        return result;
    }
    
    //complexity: O(n log n+q*n)

    // For testing
    public static void main(String[] args) {
        List<String> repository = Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad");
        String customerQuery = "mouse";

        List<List<String>> output = getSuggestions(repository, customerQuery);

        for (List<String> suggestionList : output) {
            System.out.println(suggestionList);
        }
    }
}
