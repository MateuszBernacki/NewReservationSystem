package com.mateusz.home.newReservation;

import com.mateusz.home.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class NewReservationController {


    @Autowired
    private com.mateusz.home.service.newReservationService newReservationService;

    @GetMapping("/newReservation")
    public String getNewReservation(Model model){
        return newReservationService.newReservation();
    }

    @GetMapping("/reservation/allReservation")
    public List<Reservation> getAllReservation (){
       return newReservationService.reservationList();
    }

    @GetMapping("/reservation/oneReservation/{id}")
    public Reservation selectOneReservation(@PathVariable long id){
        return newReservationService.getSingleReservation(id);
    }
}
