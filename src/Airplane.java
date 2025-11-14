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
    public Airplane(int Pcapacity){
        capacity = Pcapacity;
        name = "Etihad Airways";
        wingspan = 80;
        model = "Airbus-380";
        isDoubleDecker = true;
    }
    public void printInfo(){
        System.out.println(capacity);
        System.out.println(wingspan);
        System.out.println(model);
        System.out.println(isDoubleDecker);
        System.out.println(name);
    }
}
