package ku.cs.model;

public class CartClass {

    private double amountprice;
    private double adddeliveryprice;
    private double deliveryprice;

    public CartClass() {
        amountprice = 0;
        adddeliveryprice = 0;
        deliveryprice = 3000;
    }

    public double getAmountprice() {
        return amountprice;
    }

    public double getAdddeliveryprice() {
        return adddeliveryprice;
    }

    public void addpricedelivery(double deliveryprice) {
        adddeliveryprice += deliveryprice;
    }
    public void addamountprice(double amountprices) {
        amountprice = adddeliveryprice+deliveryprice;
    }


}