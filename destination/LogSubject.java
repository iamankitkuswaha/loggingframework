package destination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogSubject {
    Map<Integer, List<LogObserver>> logObservers = new HashMap<>();

    public void addObserver(int loggingLevel, LogObserver logObserver){
        List<LogObserver> listOfObservers = logObservers.getOrDefault(loggingLevel, new ArrayList<>());
        listOfObservers.add(logObserver);
        logObservers.put(loggingLevel, listOfObservers);
    }

    public void notifyAllObservers(int loggingLevel, String message){
        for(Map.Entry<Integer, List<LogObserver>> entry : logObservers.entrySet()){
            if(entry.getKey()==loggingLevel){
                entry.getValue().forEach(observer->observer.log(message));
            }
        }
    }
}
