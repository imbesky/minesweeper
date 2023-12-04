package imbesky.minesweeper.Controller;

import imbesky.minesweeper.domain.Board;
import imbesky.minesweeper.serivce.StopWatchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GameController {
//    private final StopWatchService stopWatch = new StopWatchService(new StopWatch());

    @GetMapping("/game")
    public void setGame(Model model){
        model.addAttribute("length",10);
//        stopWatch.start();
    }
    private void leftClicked(){
        //유저 좌클릭 감지
        //지뢰임? -> 지뢰면 게임 종료 화면
        //지뢰 아니면 주변 지뢰 개수 구하기
        //0 아니면 그대로 뷰로 리턴
        //0이면 0이 아닌 숫자로 둘러싸일 때까지 구해서 전부 리턴
    }
    private void rightClicked(){
        //유저 우클릭 감지
        // 클릭 수 가져오기
        // 바꿀 문양 찾기
    }
    private void stopWatchClicked(){
        // 타이머 정지
        // 타이머 재시작
    }

    private String  endGame(){
        // 스코어 저장
        return "end";
    }
}
