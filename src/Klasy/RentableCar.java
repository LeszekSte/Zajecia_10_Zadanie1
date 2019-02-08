package Klasy;
import InterFace1.Rentable;
public class RentableCar extends Car implements Rentable {

    private Person person;
    private boolean rent;


    public void setRent(boolean rent) {
        this.rent = rent;
    }



    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public RentableCar(String nameCar, int year, int seat, Person person, boolean rent) {
        super(nameCar, year, seat);
        this.person = person;
        this.rent = rent;
    }

    @Override
    public Person rent(String fN, String lN, String id) {

        if(isRent()) {
            person = new Person(fN,lN,id);
          } else person = null;
        return person;
    }


    public void handOver() {
        System.out.println("zwróć");
    }

    @Override
    public boolean isRent(){
        return rent;
    }

    @Override
    public String toString() {
        return  super.toString() +  "RentableCar{" +
                "person=" + person +
                ", rent=" + rent +
                '}';
    }
}
