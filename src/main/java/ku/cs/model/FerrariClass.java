package ku.cs.model;

public class FerrariClass {

    private double sfNumber;
    private double gtbNumber;
    private double pistaNuber;

    public FerrariClass(){
        sfNumber = 0;
        gtbNumber = 0;
        pistaNuber = 0;
    }

    public double getSf90Number(){
        return sfNumber;
    }

    public double getGtbNumber(){
        return gtbNumber;
    }

    public double getPistaNumber(){
        return pistaNuber;
    }

    public void addSFNumber(double numberOfSF) {
        sfNumber += numberOfSF;
    }

    public void addGtbNumber(double numberOfGTB) {
        gtbNumber += numberOfGTB;
    }

    public void addPistaNumber(double numberOfPista) {
        pistaNuber += numberOfPista;
    }

}
