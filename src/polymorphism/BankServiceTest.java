package polymorphism;

public class BankServiceTest {
    public static void main(String[] args){
        SBIBankService sbiBankService=new SBIBankService();
        double sbiBanKInterest=sbiBankService.calculateIntrest(1000,86);
        System.out.println("SBI Bank" +sbiBanKInterest);

        HDFCBankService hdfcBankService=new HDFCBankService();
        double hdfcBankInterest= hdfcBankService.calculateIntrest(1000,88);
        System.out.println("HDFC Bank" +hdfcBankInterest);
    }
}
