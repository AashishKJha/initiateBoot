package examples.designPatterns;

/**************************************************************************************************
 *                                                                                                *
 *   Abstract Factory Pattern says that just define an interface or abstract class for creating   *
 *  families of related / dependent objects but without specifying their concrete sub-classes.    *
 *  That means Abstract Factory lets a class returns a factory of classes.So, this is the reason  *
 *          that Abstract Factory Pattern is one level higher than the Factory Pattern.           *
 *                                                                                                *
 *                        An Abstract Factory Pattern is also known as Kit.                       *
 *                                                                                                *
 **************************************************************************************************/
public class AbstractFactoryPattern {


}

abstract class Bank {
    abstract String getBankName();
}

abstract class Loan {
    abstract String getLoanType();
}

class HDFC extends Bank {
    private String bankName;

    HDFC(String bankName) {
        this.bankName = bankName;
    }

    @Override
    String getBankName() {
        return bankName;
    }
}

class SBI extends Bank {
    private String bankName;

    SBI(String bankName) {
        this.bankName = bankName;
    }

    @Override
    String getBankName() {
        return bankName;
    }
}

class HomeLoan extends Loan {
    private final String loanType;

    HomeLoan(String loanType) {
        this.loanType = loanType;
    }

    @Override
    String getLoanType() {
        return this.loanType;
    }
}

class CarLoan extends Loan {
    private final String loanType;

    CarLoan(String loanType) {
        this.loanType = loanType;
    }

    @Override
    String getLoanType() {
        return this.loanType;
    }
}

abstract class AbstractFactory {
    abstract Bank getBank(String bank);

    abstract Loan getLoan(String loan);
}

class BankFactory extends AbstractFactory {
    @Override
    Bank getBank(String bank) {
        Bank bank1;
        if (bank == null) {
            return null;
        }

        switch (bank) {
            case "sbi":
                bank1 = new SBI("sbi");
                break;
            case "hdfc":
                bank1 = new HDFC("hdfc");
                break;
            default: {
                bank1 = new SBI("sbi");
            }
            break;
        }
        return null;
    }

    @Override
    Loan getLoan(String loan) {
        return null;
    }
}

class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        return null;
    }
}

class LoanFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        return null;
    }

    public Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        }
        if (loan.equalsIgnoreCase("home")) {
            return new HomeLoan("home");
        } else if (loan.equalsIgnoreCase("Business")) {
            return new CarLoan("car");
        }
        return null;
    }

}

