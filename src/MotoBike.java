public class MotoBike extends Vehicle {

    private int maxSpeed;


    public MotoBike(String nameCar, int year, int maxSpeed) {
        super(nameCar, year);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        super.toString();
        return "MotoBike{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
