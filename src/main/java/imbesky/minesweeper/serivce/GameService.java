package imbesky.minesweeper.serivce;

public class GameService {
    public void leftClicked(final boolean isMine, final int neighboringMines){
        if(isMine){
            return;//게임 종료 
        }
        if(neighboringMines==0){
            return;//0 아닌 칸으로 둘러싸일 때까지 근처 지뢰 개수 확인
        }
        return; // 값 뷰로 반환
    }
}
