package OOPConceptPart2;

public class TestCar {

    public static void main(String[] args) {

        //Static polymorphismm -- AKA compile time polymorphism (Poly means one to many method)

        BMW b = new BMW();
        b.start();
        b.theftSafety();
        b.stop();
        b.refuel();
        b.engine();

        System.out.println("***********");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();

        System.out.println("**********"); //Dynamic polymorphism or Run time polymorphism, you cannot access theftSafety method

        //Top Casting -- Child class object can be referred by parent class reference variable, we are casting of making BMW class object referred by parent class reference variable
        Car c1 = new BMW();  //When Child class object can be referred by parent class reference variable, it is called -- dynamic polyporphism or --> Run time polymorphism
        c1.start();   //Top casting is allowed as we moving small thing to big thing
        c1.stop();
        c1.refuel();

        //Down Casting --Parent class object trying to be referred by child class reference variable
        //BMW b1 = (BMW)new Car(); //You can do it in compile time but you'll get ClassCastException during run time because parent cannot be fit into child class
        // reference variable

    }
}
