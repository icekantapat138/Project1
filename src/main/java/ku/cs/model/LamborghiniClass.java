package ku.cs.model;

public class LamborghiniClass {

    private double avensNumber;
    private double evoNumber;
    private double urusNuber;

    public LamborghiniClass(){
        avensNumber = 0;
        evoNumber = 0;
        urusNuber = 0;
    }

    public double getAvensNumber(){
        return avensNumber;
    }

    public double getEvoNumber(){
        return evoNumber;
    }

    public double getUrusNuber(){
        return urusNuber;
    }

    public void addAvensNumber(double numberOfAvenscar) {
         avensNumber += numberOfAvenscar;
    }

    public void addEVONumber(double numberOfEVOcar) {
        evoNumber += numberOfEVOcar;
    }

    public void addUrusNumber(double numberOfUruscar) {
        urusNuber += numberOfUruscar;
    }

}
