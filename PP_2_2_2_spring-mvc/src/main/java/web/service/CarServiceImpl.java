package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    List<Car> carList = new ArrayList<>();


    public CarServiceImpl() {
        carList.add(new Car("BMW", "Black", "Mr. Smith"));
        carList.add(new Car("Bugatti", "Blue", "Mrs. Smith"));
        carList.add(new Car("Копейка", "Синий", "Петрович"));
        carList.add(new Car("Десятка", "Белая", "г-н Ух"));
        carList.add(new Car("Так себе тачка", "Непонятный", "Потеряшка"));
    }


    @Override
    public List<Car> showCar(int someNumber) {
        List<Car> listOfCars = new ArrayList<>();
        for (int i = 0; i < someNumber; i++) {
            listOfCars.add(carList.get(i));
        }
        return listOfCars;
    }
}
