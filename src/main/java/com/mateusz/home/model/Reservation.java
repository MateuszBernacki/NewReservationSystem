package com.mateusz.home.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ARRIVAL_DATE", nullable = false)
    private Date arrivalDate ;
    @Column(name = "DEPARTURE_DATE", nullable = false)
    private Date departureDate;
    @Column(name = "CREATION", nullable = false)
    private LocalDateTime create;
}
