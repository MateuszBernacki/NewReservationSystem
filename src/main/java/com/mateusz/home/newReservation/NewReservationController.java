package com.mateusz.home.newReservation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewReservationController {

    @GetMapping("/newReservation")
    public String getNewReservation(Model model){
        return "newReservation/index.html";
    }
}
