package imbesky.minesweeper.domain;

public class Player {
    private Long id;
    private final String name; // validation 필요
    private Score score;

    public Player(final String name){
        this.name = name;
    }

}
