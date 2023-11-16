package imbesky.minesweeper.constant;

public enum Level {
    EASY(0.1F),
    ORIGINAL(0.2F),
    HARD(0.3F);
    private final float ratio;
    Level(final float ratio){
        this.ratio = ratio;
    }

    public float getRatio() {
        return ratio;
    }
}
