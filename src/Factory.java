public class Factory {
    public int yearFounded = 1798;
    public String factoryName = "Airplanes";
    public boolean isOpen = true;


    public static void main(String[] args) {
        System.out.println("Welcome to Panshul's factory!");
        new Factory();
    }

    //Constructors are special types of methods that have same name to the class
    //Constructors allow us to make a factory (in this case)
    //scope is the whole class
    public Factory(){
        factoryInfo();
        isOpen = false;
        //string for manager is only in the constructor
        String manager = "Mr. Hales";

        //todo: change the variable yearFounded to be a different value
        //todo: call factoryInfo();
    }

    public void factoryInfo (){
        System.out.println(yearFounded);
        System.out.println(factoryName);
        System.out.println(isOpen);
    }

}
