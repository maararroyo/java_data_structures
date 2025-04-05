/*
You are given a list of log entries from a system. Each log entry is a string 
formatted like:
    "user1 login", "user2 logout", "user1 logout", "user3 login", ...
Write a function that counts how many times each user appears in the logs.

OUTPUT:
  {
  "user1": 2,
  "user2": 1,
  "user3": 1
  }

*/ 
package countoccurrenceslogs;

import java.util.*;

public class CountOccurrencesLogs {
    //queremos devolver el mapa de usuarios y las veces que aparece
    //recibe una lista de logs
    public static Map<String, Integer> countOccurrences(List<String> logs) {
        //creamos un mapa vacío para guardar los conteos por usuario
        Map<String, Integer> userCountMap = new HashMap<>();
        
        //recorremos cada línea del log
        for (String entry : logs){
            //separamos "user1" "login"
            String[]parts = entry.split(" ");
            //guardamos el nombre en parts[]
            String username = parts[0]; 
            if(userCountMap.containsKey(username)){
                userCountMap.put(username, userCountMap.get(username)+1);
            }else {
                userCountMap.put(username, 1);
            }
        }
        return userCountMap;
    }
    
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
            "user1 login",
            "user2 logout",
            "user1 logout",
            "user3 login",
            "user2 login",
            "user3 logout",
            "user1 login"
        );

        Map<String, Integer> result = countOccurrences(logs);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
        }
    }
}
