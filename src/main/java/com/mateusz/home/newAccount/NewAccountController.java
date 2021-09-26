package com.mateusz.home.newAccount;

import com.mateusz.home.service.NewAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewAccountController {

    @Autowired
    private NewAccountService newAccountService;

    @GetMapping("/newAccount")
    public String getNewAccount(Model model){
        return newAccountService.newAccountSer();
    }
}
