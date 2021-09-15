package com.mateusz.home;

import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;

@Controller
public class ReservationHomeController {

    @SneakyThrows
    @RequestMapping("/")
    public String getHome(Model model) {
        model.addAttribute("hostAddress", InetAddress.getLocalHost().getHostAddress());
        model.addAttribute("hostName", InetAddress.getLocalHost().getHostAddress());
        return "home/home.html";
    }
}
