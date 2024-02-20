package polymorphism;

public class HDFCBankService extends RBIBankSevice{
    public double calculateIntrest(int principalAmt) {
        double totalAmt = 0;
        double intrestAmt = super.calculateInterest(principalAmt);
        totalAmt = intrestAmt + principalAmt;
        return totalAmt;
    }

    public double calculateIntrest(int principalAmt,int days){
        double totalAmt=0;
        if(days>89){
            return  this.calculateIntrest(principalAmt);
        }
        return totalAmt+principalAmt;
    }
}
