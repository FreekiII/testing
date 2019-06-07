package hi_test;

import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class MessageLogModel {
    private LinkedList<String> log = new LinkedList<>();

    public void newMsg(String message) {
        log.add(message);
    }

    public LinkedList<String> getLog() {
        return log;
    }
}
