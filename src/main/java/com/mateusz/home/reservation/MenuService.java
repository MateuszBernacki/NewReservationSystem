package com.mateusz.home.reservation;


import com.mateusz.home.reservation.Menudto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    public List<Menudto> getMenu() {
        return List.of(
                new Menudto("New reservation."),
                new Menudto("   Create account."),
                new Menudto("   Log in.")
            );
    }
}
