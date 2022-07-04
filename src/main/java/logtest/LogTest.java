package logtest;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.quarkus.runtime.Startup;

@Startup
public class LogTest {
    private final static Logger log = Logger.getLogger("mylogger");

    public LogTest(){
        log.log(Level.FINEST, "This message is at FINEST");
        log.log(Level.FINER, "This message is at FINER");
    }
}
