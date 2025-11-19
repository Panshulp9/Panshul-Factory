public class Airplane {

    // Instance variables
    // Used throughout the class
    // Placed at the top
    // Have public in front
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDecker;
    public int wingspan;
    public Airplane () {
        capacity = 615;
        name = "Etihad Airways";
        wingspan = 80;
        model = "Airbus-380";
        isDoubleDecker = true;

    }
    //todo: add a paremter for model isDoubleDecker and length to the constructor
    //to set the value of the instance variables to the parameters
    //fix the related problems in factory
    public Airplane(int Pcapacity, String pName, String pModel, boolean pIsDoubleDecker, int pWingspan){
        capacity = Pcapacity;
        name = pName;
        wingspan = pWingspan;
        model = pModel;
        isDoubleDecker = pIsDoubleDecker;
        name = pName;
    }
    public void printInfo(){
        System.out.println(capacity);
        System.out.println(wingspan);
        System.out.println(model);
        System.out.println(isDoubleDecker);
        System.out.println(name);
    }
}
