package com.mateusz.home.reservation;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    public List<MenuDto> getMenu() {
        return List.of(
                new MenuDto("New reservation.","/newReservation"),
                new MenuDto("Create account.", "/newAccount"),
                new MenuDto("Log in.", "/startLogin")
            );
    }
}
