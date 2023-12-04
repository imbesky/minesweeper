package imbesky.minesweeper.domain;

import static imbesky.minesweeper.constant.Number.INITIAL_VALUE;
import static imbesky.minesweeper.constant.Number.SINGLE_TILE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Board {
    private final List<List<Boolean>> board = new ArrayList<>();
    private final int mineNumber;
    private final int totalTiles;
    public Board(final int length, final float ratio){
        makeBoard(length);
        mineNumber = Math.round(length*ratio);
        totalTiles = length*length;
    }
    public boolean isMine(final int row,final int column){
        return board.get(row).get(column);
    }
    public int neighboringMineNumber(final int row, final int column){
        int number = INITIAL_VALUE;
        for(int i = row-SINGLE_TILE; i <= row + SINGLE_TILE; i++){
            number += mineNumberInBothSides(row,column);
        }
        return number;
    }
    private void makeBoard(final int length){
        for(int row = INITIAL_VALUE; row < length; row++){
            board.add(makeBoardRow(row,length));
        }
        Collections.shuffle(board);
    }
    private List<Boolean> makeBoardRow(final int row,final int length){
        final List<Boolean> boardRow = new ArrayList<>();
        for(int column = INITIAL_VALUE; column < length; column++){
            boardRow.add(isThisMine(length * row + column));
        }
        Collections.shuffle(boardRow);
        return boardRow;
    }
    private Boolean isThisMine(final int tileNumber){
        Random random = new Random();
        if((totalTiles - tileNumber) == mineNumber) {
            return true;
        }
        return random.nextInt(totalTiles)>mineNumber;
    }
    private int mineNumberInBothSides(final int row, final int column){
        int number = INITIAL_VALUE;
        for (int i = column - SINGLE_TILE; i <= column + SINGLE_TILE; i++){
            if(board.get(row).get(i).equals(true)){
                number++;
            }
        }
        return number;
    }
}
