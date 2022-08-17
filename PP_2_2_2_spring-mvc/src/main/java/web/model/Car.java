package web.model;

public class Car {
    private String colour;
    private String carDrand;
    private String carOwner;

    public Car() {
    }

    public Car(String carDrand, String colour, String carOwner) {
        this.carDrand = carDrand;
        this.colour = colour;
        this.carOwner = carOwner;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCarDrand() {
        return carDrand;
    }

    public void setCarDrand(String carDrand) {
        this.carDrand = carDrand;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }
}
