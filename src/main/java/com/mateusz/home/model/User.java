package com.mateusz.home.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;
    @Column(name = "SUR_NAME", nullable = false)
    private String lastName;
    @Column(name = "NEW_LOGIN", nullable = false)
    private String newLogIn;
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    @Column(name = "EMAIL_ADDRESS", nullable = false)
    private String emailAddress;
    @Column(name = "CREATION", nullable = false)
    private LocalDateTime create;



}
