package imbesky.minesweeper;

import static org.assertj.core.api.Assertions.assertThat;

import imbesky.minesweeper.constant.Size;
import imbesky.minesweeper.constant.Group;
import imbesky.minesweeper.constant.Level;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GroupTest {
    @Test
    @DisplayName("값으로 그룹 찾기 테스트")
    void findByValueTest(){
        final int rowLength = Size.LARGE.getRowLength();
        final float ratio = Level.EASY.getRatio();

        final Group expectation = Group.GROUP_3_1;
        assertThat(Group.findByValue(rowLength,ratio)).isEqualTo(expectation);
    }
}
