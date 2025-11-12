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
    public Factory(){
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
        //todo: make 2 more airplane objects
        //todo: for one of the objects chnge all the instance variables
        //todo: for both objects print all the instance variables
    }

    public void factoryInfo (){
        System.out.println(yearFounded);
        System.out.println(factoryName);
        System.out.println(isOpen);
    }

}
