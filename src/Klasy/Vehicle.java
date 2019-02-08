package Klasy;

import Enum1.Direction;
import InterFace1.Moveable;

public abstract class Vehicle implements Moveable {


    private String nameCar;
    private int year;
    private String direction;


    public Vehicle(String nameCar, int year) {
        this.nameCar = nameCar;
        this.year = year;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Klasy.Vehicle{" +
                "nameCar='" + nameCar + '\'' +
                ", year=" + year +
                "} ";
    }

    @Override
    public void turnLeft() {
       direction =(Direction.TURN_LEFT).getDescription();
    }

    @Override
    public void turnRight() {
        direction =(Direction.TURN_RIGHT).getDescription();
    }

    @Override
    public void goForward() {
        direction =(Direction.GO_FORWARD).getDescription();
    }

    @Override
    public void goBack() {
        direction =(Direction.GO_BACK).getDescription();
    }


}
