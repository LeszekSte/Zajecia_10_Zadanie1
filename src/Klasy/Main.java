package Klasy;

public class Main {

    public static void main(String[] args) {

        RentableCar rentableCar = new RentableCar("ford", 1954, 5 ,null,false);
        Person person1 = new Person("jaś", "kowa ", "154");
        RentableCar rentableCar1 = new RentableCar("ford", 1954, 5 ,person1,true);
        System.out.println( rentableCar1.toString());



    }
}
