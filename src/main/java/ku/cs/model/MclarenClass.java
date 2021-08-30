package ku.cs.model;

public class MclarenClass {

    private double p1Number;
    private double LTNumber;
    private double coupeNumber;

    public MclarenClass(){
        p1Number = 0;
        LTNumber = 0;
        coupeNumber = 0;
    }

    public double getP1Number(){
        return p1Number;
    }

    public double getLTNumber(){
        return LTNumber;
    }

    public double getCoupeNumber(){
        return coupeNumber;
    }

    public void addP1Number(double numberOfP1) {
        p1Number += numberOfP1;
    }

    public void addLTNumber(double numberOfLT) {
        LTNumber += numberOfLT;
    }

    public void addCoupeNumber(double numberofCoupe) {
        coupeNumber += numberofCoupe;
    }

}
