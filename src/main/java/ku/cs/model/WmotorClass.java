package ku.cs.model;

public class WmotorClass {

    private double lykanNumber;
    private double fenyrNumber;

    public WmotorClass(){
        lykanNumber = 0;
        fenyrNumber = 0;
    }

    public double getLykanNumber(){
        return lykanNumber;
    }

    public double getFenyrNumber(){
        return fenyrNumber;
    }

    public void addlykanNumber(double numberOflykan) {
        lykanNumber += numberOflykan;
    }

    public void addfenyrNumber(double numberOffenyr) {
        fenyrNumber += numberOffenyr;
    }

}
