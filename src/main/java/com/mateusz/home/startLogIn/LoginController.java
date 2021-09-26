package com.mateusz.home.startLogIn;

import com.mateusz.home.service.StartLogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private StartLogInService startLogInService;

    @GetMapping("/login")
    public String getStartLogin(Model model){
        return startLogInService.startLogInSer();
    }
}
