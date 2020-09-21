package web.servise;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class ServiceCars {

    public static List<Cars> getCars() {

        List<Cars> cars = new ArrayList<>();

        cars.add(new Cars("BMW", 2, 1800000));
        cars.add(new Cars("AUDI", 4, 2000000));
        cars.add(new Cars("Mercedes", 3, 2500000));

        return cars;
    }
}

