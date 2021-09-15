package com.mateusz.home.reservation;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ReservationRestController {

@Autowired
private MenuService menuService;

    @SneakyThrows
    @GetMapping("/res")
    public List<Menudto> getHome() {
        return menuService.getMenu();
    }
}
