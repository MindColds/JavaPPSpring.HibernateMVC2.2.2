package web.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Car {
    private String colour;
    private String carBrand;
    private String carOwner;

    public Car() {
    }

    public Car(String carBrand, String colour, String carOwner) {
        this.carBrand = carBrand;
        this.colour = colour;
        this.carOwner = carOwner;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarDrand(String carDrand) {
        this.carBrand = carDrand;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(colour, car.colour) && Objects.equals(carBrand, car.carBrand) && Objects.equals(carOwner, car.carOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, carBrand, carOwner);
    }
}
