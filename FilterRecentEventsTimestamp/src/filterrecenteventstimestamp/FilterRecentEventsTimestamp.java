
package filterrecenteventstimestamp;
/*
You receive a list of event logs in the format event_id,timestamp, and you want 
to return only the events that happened in the last 24 hours from now.

Assume timestamps are ISO 8601 format ("2023-04-02T10:45:00").
*/
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class FilterRecentEventsTimestamp {

    //recibing a list of strings of the events
    //return a list of events in the last 24 hours
    public static List<String> filterLast24Hours(List<String> events) {
        //List that keeps the events
        List<String> recentEvents = new ArrayList();
        
        //actual time
        LocalDateTime now = LocalDateTime.now();
        //Limit of time 
        LocalDateTime cutoff = now.minusHours(24);
        
        //Understanding the format
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        
        //Iterate all the events in the list
        for (String event: events){
            //separte the events
            String[] parts= event.split(",");
            String eventId = parts[0];
            String timestampString = parts[1];
            //Convert 
            LocalDateTime eventTime = LocalDateTime.parse(timestampString, formatter);
            //if the event occurs after the limit
            if(eventTime.isAfter(cutoff)){
                recentEvents.add(event);
            }
        }
        return recentEvents;
    }
    
    //Complexity: O(n) 
    
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
            "login1,2025-04-04T09:30:00",
            "login2,2025-04-03T08:00:00",
            "login3,2025-04-03T20:00:00",
            "login4,2025-04-02T12:00:00"
        );

        List<String> result = filterLast24Hours(logs);

        for (String r : result) {
            System.out.println(r);
        }
    }
}

/*
CONSIDERATIONS:
What if a event happend exactly 24 hours ago?
What if a events doesn't happen yet?
What if we use try/catch?
*/
