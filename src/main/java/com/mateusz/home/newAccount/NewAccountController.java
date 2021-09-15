package com.mateusz.home.newAccount;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewAccountController {


    @GetMapping("/newAccount")
    public String getNewAccount(Model model){
        return "newAccount//index.html";
    }
}
