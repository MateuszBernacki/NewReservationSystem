package com.mateusz.home.service;


import com.mateusz.home.model.Reservation;
import com.mateusz.home.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class newReservationService {

public String newReservation() {
    return "newReservation/login.html";
}

    private final ReservationRepository reservationRepository;


    public List<Reservation> reservationList(){
        return reservationRepository.findAll();
    }


    public Reservation getSingleReservation(long id) {
            return reservationRepository.findById(id).orElseThrow();
    }
}
