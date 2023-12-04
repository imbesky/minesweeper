package imbesky.minesweeper.domain;

import imbesky.minesweeper.constant.Group;
import org.springframework.util.StopWatch;

public class Score {
    private final long clearTime;
    private final Group group;
    public Score(final long clearTime, final int length, final float raito){
        this.clearTime = clearTime;
        group = Group.findByValue(length, raito);
    }
}
