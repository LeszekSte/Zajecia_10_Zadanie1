public abstract class  Vehicle   {

    private String nameCar;
    private int year;

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
        return "Vehicle{" +
                "nameCar='" + nameCar + '\'' +
                ", year=" + year +
                '}';
    }
}
