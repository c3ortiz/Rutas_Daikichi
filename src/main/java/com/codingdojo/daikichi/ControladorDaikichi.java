package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ControladorDaikichi {
    @RequestMapping("/travel/{city}")
    public String viajeCiudad(@PathVariable("city") String city) {
        return "¡Felicitaciones! ¡Pronto viajarás a " + city + "!";
    }

    @RequestMapping("/lotto/{number}")
    public String lottoSuerte(@PathVariable("number") Integer number) {
        return number % 2 == 0 ? "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras" : "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
    }
}
