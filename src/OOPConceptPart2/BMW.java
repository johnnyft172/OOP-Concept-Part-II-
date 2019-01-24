package OOPConceptPart2;

public class BMW extends Car { //Keyword extends creates a relationship

    public void start() { /*When the same method name is in both parent and child class like the start method below, it will call from the child class since child has it's own modified version
        Method-Overridden---> When same method is present in parent class as well as in child class with the same name and same number of arguments*/
        System.out.println("BMW.....Start");
    }

    public void theftSafety(){
        System.out.println("BMW...AdvancedTheftSafety");
    }
}


 //Method overloading ---> When the method name is the same but with DIFFERENT arguments or input parameters within the same class