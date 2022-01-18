package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("model1", "black", 1));
        carList.add(new Car("model2", "brown", 2));
        carList.add(new Car("model3", "blue", 3));
        carList.add(new Car("model4", "gray", 4));
        carList.add(new Car("model5", "yellow", 5));

    }

    @Override
    public List <Car> listCars(Integer numberOfCars) {
        if(numberOfCars == null || numberOfCars >= carList.size()) {
            return carList;
        } else if (numberOfCars<carList.size()) {
            return carList.subList(0, numberOfCars);
        }
        return null;
    }
}
