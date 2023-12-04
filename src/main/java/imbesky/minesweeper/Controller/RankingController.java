package imbesky.minesweeper.Controller;

import imbesky.minesweeper.domain.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RankingController {
    @GetMapping("/ranker")
    @ResponseBody
    public void getRankerName(@RequestParam(value = "name", required = false) String name){

    }

    // 랭킹 정보 보내주기
}
