package net.stntwk.springmvcmodelsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("showinputform")
    public String showInputForm(){
        return "ShowInputForm";
    }

    @PostMapping("confirmdata")
    public String confirmData(Model model, MainForm form){
        model.addAttribute("form", form);
        return "ConfirmData";
    }
}
