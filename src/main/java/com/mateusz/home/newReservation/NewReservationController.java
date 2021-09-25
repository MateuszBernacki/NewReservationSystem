package com.mateusz.home.newReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewReservationController {


    @Autowired
    private newReservationService newReservationService;

    @GetMapping("/newReservation")
    public String getNewReservation(Model model){
        return newReservationService.newReservation();
    }
}
