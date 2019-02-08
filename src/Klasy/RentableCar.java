package Klasy;

import InterFace1.Rentable;
import Klasy.Car;

public class RentableCar extends Car implements Rentable {



    public RentableCar(String nameCar, int year, int seat) {
        super(nameCar, year, seat);

    }

    @Override
    public Person rent(String fN, String lN, String id) {

        
        return null;
    }

    @Override
    public void hendOver() {

    }

    @Override
    public boolean isRent() {
        return false;
    }
}
