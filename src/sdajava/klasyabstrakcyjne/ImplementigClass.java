package sdajava.klasyabstrakcyjne;

/**
 * Created by Andrzej on 27.02.2017.
 */
public class ImplementigClass extends  AbstractClass {


    @Override  //oznaczamy metody, które są przysłaniane (wykorzystane drugi raz)
    public void abstractMetod() {


    }

    @Override
    public void implementMetod() {
        System.out.println("Nadpisanie metody implementMetod()" + "\nz klasy abstrakcyjnej");

    }
}
