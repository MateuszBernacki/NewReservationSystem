package com.mateusz.home.startLogIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartLogin {

    @Autowired
    private StartLogInService startLogInService;

    @GetMapping("/startLogin")
    public String getStartLogin(Model model){
        return startLogInService.startLogInSer();
    }
}
