package InterFace1;

import Klasy.Person;

public interface Rentable {

    Person rent( String fN, String lN, String id);
    void hendOver ();
    boolean isRent(); 


}
