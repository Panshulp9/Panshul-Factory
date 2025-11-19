import java.sql.SQLOutput;

public class Factory {
    public int yearFounded = 1799;
    public String factoryName = "Airplanes";
    public boolean isOpen = true;


    public static void main(String[] args) {
        System.out.println("Welcome to Panshul's factory!");
        new Factory();
    }

    //Constructors are special types of methods that have same name to the class
    //Constructors allow us to make a factory (in this case)
    //scope is the whole class
    //no void
    public Factory() {
        factoryInfo();
        isOpen = false;
        //string for manager is only in the constructor
        String manager = "Mr. Hales";

        //todo: change the variable yearFounded to be a different value
        //todo: call factoryInfo();
        // Type varName = value
        // Object of type airplane
        Airplane plane1 = new Airplane();

        System.out.println(plane1.name);
        System.out.println(plane1.capacity);
        System.out.println(plane1.isDoubleDecker);
        System.out.println(plane1.wingspan);
        System.out.println(plane1.model);

        Airplane plane2 = new Airplane();
        System.out.println(plane1.name);
        System.out.println(plane2.capacity);
        System.out.println(plane1.isDoubleDecker);
        System.out.println(plane1.wingspan);
        System.out.println(plane1.model);
        //todo: make 2 more airplane objects
        //todo: for one of the objects change all the instance variables
        //todo: for both objects print all the instance variables
        Airplane plane3 = new Airplane();
        plane3.isDoubleDecker = false;
        plane3.name = "Emirates";
        plane3.capacity = 690;
        plane3.wingspan = 79;
        plane3.model = "B747";
        System.out.println(plane1.name);
        System.out.println(plane2.capacity + 10);
        System.out.println(plane3.isDoubleDecker);
        System.out.println(plane1.wingspan);
        System.out.println(plane1.model);
        Airplane plane4 = new Airplane(232, "Etihad Airways", "Airbus 380", true, 180);
        plane4.printInfo();
        Musical set1 = new Musical();
        set1.printInfo();
        Musical set2 = new Musical(17, "Something Rotten", true);
        set2.printInfo();
    }





    public void factoryInfo (){
        System.out.println(yearFounded);
        System.out.println(factoryName);
        System.out.println(isOpen);
    }

}
