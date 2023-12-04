package imbesky.minesweeper.constant;

import static imbesky.minesweeper.constant.Size.LARGE;
import static imbesky.minesweeper.constant.Size.MEDIUM;
import static imbesky.minesweeper.constant.Size.SMALL;
import static imbesky.minesweeper.constant.Level.EASY;
import static imbesky.minesweeper.constant.Level.HARD;
import static imbesky.minesweeper.constant.Level.ORIGINAL;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Group {
    GROUP_1_1(SMALL, EASY),
    GROUP_1_2(SMALL, ORIGINAL),
    GROUP_1_3(SMALL, HARD),
    GROUP_2_1(MEDIUM, EASY),
    GROUP_2_2(MEDIUM, ORIGINAL),
    GROUP_2_3(MEDIUM, HARD),
    GROUP_3_1(LARGE, EASY),
    GROUP_3_2(LARGE, ORIGINAL),
    GROUP_3_3(LARGE, HARD);
    private final Size size;
    private final Level level;
    private static final Map<Integer, Group> groups = Collections
            .unmodifiableMap(Stream
                    .of(values())
                    .collect(Collectors
                            .toMap(Group-> (int) (Group.getBoard().getRowLength()
                                            + Group.getLevel().getRatio()*10),
                                    Group->Group)));

    Group(final Size size, final Level level){
        this.size = size;
        this.level = level;
    }

    public Size getBoard() {
        return size;
    }

    public Level getLevel() {
        return level;
    }
    public static Group findByValue(final int rowLength, final float ratio){
        return groups.get((int)(rowLength + ratio*10));
    }

}
