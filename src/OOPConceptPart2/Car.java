package OOPConceptPart2;

import jdk.swing.interop.SwingInterOpUtils;

public class Car extends Vechile {

    public void start() {
        System.out.println("Car....Run");
    }

    public void stop() {
        System.out.println("Car....Stop");
    }

    public void refuel(){
        System.out.println("Car....Refuel");
    }
}
