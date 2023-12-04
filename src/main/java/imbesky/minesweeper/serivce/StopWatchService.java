package imbesky.minesweeper.serivce;

import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;


public class StopWatchService {
    private final StopWatch stopWatch;
    public StopWatchService(final StopWatch stopWatch){
        this.stopWatch = stopWatch;
    }

    public void start(){
        stopWatch.start();
    }
    public void pause(){
        stopWatch.stop();
    }
    public void reStart(){
        stopWatch.start();
    }
    public void stop(){
        stopWatch.stop();
    }
    public long getTime(){
        return stopWatch.getTotalTimeMillis();
    }
}
