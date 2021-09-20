package com.mateusz.home.startLogIn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartLogin {

    @GetMapping("/startLogin")
    public String getStartLogin(Model model){
        return "startLogin/index.html";
    }
}
