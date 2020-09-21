package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;

import java.util.List;

import static web.servise.ServiceCars.getCars;


@Controller
public class СarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "locale", required = false) String locale, ModelMap model) {

        List<Cars> cars = getCars();

        String loc = null;

        if (locale != null) {
            if (locale.contains("en")) {
                loc = "CARS";
            } else if (locale.contains("ru")) {
                loc = "МАШИНЫ";
            }
        }

        model.addAttribute("cars", cars);
        model.addAttribute("loc", loc);
        model.addAttribute("locale", locale);

        return "cars";
    }
}
