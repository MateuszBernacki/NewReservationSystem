package com.mateusz.home.storage.allReservation;


import com.mateusz.home.model.Reservation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class ReservationStorage {

    public List<Reservation> listOfReservation;


    public void addToReservationList(Reservation reservation){
        listOfReservation.add(reservation);
    }

    @GetMapping("/reservation/allReservation")
    public void printFullReservationList (){
        for (Reservation reservatonas :
                listOfReservation) {
            System.out.println(reservatonas);
        }
    }

    public void selectOnereseReservation(){
        throw new IllegalArgumentException("this is nor redy yet");
    }
}
