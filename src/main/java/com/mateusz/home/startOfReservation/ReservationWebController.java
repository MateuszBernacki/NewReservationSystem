package com.mateusz.home.startOfReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationWebController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/reservation")
    public String getReservation(Model model){
        model.addAttribute("menuItems", menuService.getMenu());
        return "home/index";
    }
}
