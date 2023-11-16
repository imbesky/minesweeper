package imbesky.minesweeper.constant;

public enum Size {
    SMALL(10),
    MEDIUM(15),
    LARGE(20);
    private final int rowLength;
    Size(final int rowLength){
        this.rowLength = rowLength;
    }

    public int getRowLength() {
        return rowLength;
    }
}
