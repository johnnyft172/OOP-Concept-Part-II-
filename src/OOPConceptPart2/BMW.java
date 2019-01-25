package OOPConceptPart2;

public class BMW extends Car { //Keyword extends creates a relationship

    public void start() {
        System.out.println("BMW.....Start");
    }

    /*When the same method name is in both parent and child class like the start method above, it will call from the child class since child has
    it's own modified version.
    Method-Overridden---> When same method is present in parent class as well as in child class with the SAME "NAME" and SAME # of ARGUMENTS*/

    public void theftSafety(){
        System.out.println("BMW...AdvancedTheftSafety");
    }
}


 //Method overloading ---> When the method "NAME" is the same but with DIFFERENT ARGUMENTS or INPUT PARAMETERS within the same class
//Overloading allows different methods to have same name, but different signatures where signature can differ by number of input parameters
// or type of input parameters or both.     Overloading is related to compile time (or static) polymorphism.

