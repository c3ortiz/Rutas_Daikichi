package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ControladorDaikichi {
    @RequestMapping("")
    public String daikichi() {
        return "¡Bienvenido!";
    }

    @RequestMapping("/today")
    public String today() {
        return "¡Hoy encontrará suerte en todos tus esfuerzos!";
    }
}
