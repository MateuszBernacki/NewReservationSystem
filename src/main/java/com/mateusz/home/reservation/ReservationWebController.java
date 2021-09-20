package com.mateusz.home.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReservationWebController {

    @Autowired
    private MenuService menuService;

@GetMapping("/reservation")
public String getReservation(Model model){
model.addAttribute("menuItems", menuService.getMenu());
return "home/index";
}

    @RequestMapping(value = {"/newReservation2"}, method = RequestMethod.GET)
    public String getnewReservation(Model model) {
        return "newReservation/index.html";
    }

}
