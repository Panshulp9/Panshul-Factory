public class Musical {
    public int Height = 19;
    public String musicalName = "Hadestown";
    public boolean itIsGood = true;

    public void printInfo (){
        System.out.println(Height);
        System.out.println(musicalName);
        System.out.println(itIsGood);
    }
    public Musical() {
        Height = 20;
        musicalName = "Mean Girls";
        itIsGood = false;
    }
    public Musical( int pHeight, String pMusicalName, boolean pItisGood){

    }
}
