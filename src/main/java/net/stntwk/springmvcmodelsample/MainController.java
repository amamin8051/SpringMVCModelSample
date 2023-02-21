package net.stntwk.springmvcmodelsample;

import net.stntwk.springmvcmodelsample.MainForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController{
    @GetMapping("showinputform")
    public String showInputForm(Model m){
        List<String> fruits = Arrays.asList("りんご", "ぶどう", "みかん", "すいか", "いちご");
        m.addAttribute("fruits", fruits);
        return "ShowInputForm";
    }

    @PostMapping("confirmdata")
    public String confirmData(Model m, MainForm f){
        m.addAttribute("form", f);
        return "ConfirmData";
    }
}
