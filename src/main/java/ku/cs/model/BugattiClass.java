package ku.cs.model;

public class BugattiClass {

    private double veyronNumber;
    private double chironNumber;

    public BugattiClass(){
        veyronNumber = 0;
        chironNumber = 0;
    }

    public double getVeyronNumber(){
        return veyronNumber;
    }

    public double getChironNumber(){
        return chironNumber;
    }

    public void addVeyronNumber(double numberOfveyron) {
        veyronNumber += numberOfveyron;
    }

    public void addChironNumber(double numberOfchiron) {
        chironNumber += numberOfchiron;
    }

}
