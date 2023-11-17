package imbesky.minesweeper.Controller;

import imbesky.minesweeper.constant.Level;
import imbesky.minesweeper.constant.Size;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomizeController {
    @GetMapping("customize")
    public String customize(Model model){
        model.addAttribute("sizes", Size.values());
        model.addAttribute("levels", Level.values());
        return "customize";
    }
}
