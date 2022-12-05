package oop;

public class constructorExm {
    // declaring attributes
    int id;
    String name;
    String department;
    String batch;

    // constructor
    public constructorExm(int std_id, String std_name, String std_department, String std_batch) {
        id = std_id;
        name = std_name;
        department = std_department;
        batch = std_batch;
    }

    public static void main(String[] args) {
        // create first object
        constructorExm cFirst = new constructorExm(202010019, "Md. Zahangir Alam", "CSE", "63th");

        System.out.println(
            "id= " + cFirst.id + "\n" + 
            "name= " + cFirst.name + "\n" +
            "department= " + cFirst.department + "\n" +
            "batch= " + cFirst.batch
        );

        System.out.println("---------------------------");

        // create second object
        constructorExm cSec = new constructorExm(202110319, "Nayem Hasan", "BBA", "34th");

        System.out.println(
            "id= " + cSec.id + "\n" + 
            "name= " + cSec.name + "\n" +
            "department= " + cSec.department + "\n" +
            "batch= " + cSec.batch
        );
    }
}
