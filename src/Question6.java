 class Bank {
    private String name;
    private String headofficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHeadofficeAddress() {
        return headofficeAddress;
    }
    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }
    public String getChairmanName() {
        return chairmanName;
    }
    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }
    public int getBranchCount() {
        return branchCount;
    }
    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }
    public double getFdInterestRate() {
        return fdInterestRate;
    }
    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }
    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }
    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }
    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    @Override
    public String toString() {
        return "Bank [Name: " + name + ", Head Office Address: " + headofficeAddress +
                ", Chairman: " + chairmanName + ", Branch Count: " + branchCount +
                ", FD Interest Rate: " + fdInterestRate + "%, Personal Loan Interest Rate: " +
                personalLoanInterestRate + "%, Home Loan Interest Rate: " + homeLoanInterestRate + "%]";
    }
}


 class BOI extends Bank {
     public BOI() {
         setName("Bank of India");
         setHeadofficeAddress("Mumbai, Maharashtra");
         setChairmanName("ABCD");
         setBranchCount(5000);
         setFdInterestRate(5.5);
         setPersonalLoanInterestRate(11.0);
         setHomeLoanInterestRate(8.0);
     }

     @Override
     public String toString() {
         return "BOI: " + super.toString();
     }


     public class ICICI extends Bank {
         public ICICI() {
             setName("ICICI Bank");
             setHeadofficeAddress("Mumbai, Maharashtra");
             setChairmanName("EFGH");
             setBranchCount(5000);
             setFdInterestRate(6.0);
             setPersonalLoanInterestRate(9.0);
             setHomeLoanInterestRate(8.5);
         }

         @Override
         public String toString() {
             return "ICICI: " + super.toString();
         }
     }


     class SBI extends Bank {
         public SBI() {
             setName("State Bank of India");
             setHeadofficeAddress("Mumbai, Maharashtra");
             setChairmanName("XYZ");
             setBranchCount(22000);
             setFdInterestRate(5.0);
             setPersonalLoanInterestRate(10.5);
             setHomeLoanInterestRate(7.5);
         }


         @Override
         public String toString() {
             return "SBI: " + super.toString();
         }
     }


     class Question6 {
         public static void main(String[] args) {
             SBI sbi = new SBI();
             BOI boi = new BOI();
             ICICI icici = new ICICI();


             System.out.println(sbi);
             System.out.println(boi);
             System.out.println(icici);
         }
     }

