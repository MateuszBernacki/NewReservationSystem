package com.mateusz.home.startOfReservation;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    public List<MenuDto> getMenu() {
        return List.of(
                new MenuDto("New reservation.","/newReservation"),
                new MenuDto("Create account.", "/newAccount")
            );
    }
}
