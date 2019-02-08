package Klasy;

public class Car  extends Vehicle {
    private int seat;

    public Car(String nameCar, int year, int seat) {
        super(nameCar, year);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        super.toString();
        return "Klasy.Car{" +
                "seat=" + seat +
                '}';
    }
}
