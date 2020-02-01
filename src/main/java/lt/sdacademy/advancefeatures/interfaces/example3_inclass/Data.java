package lt.sdacademy.advancefeatures.interfaces.example3_inclass;

import java.math.BigDecimal;

public class Data implements FindRichest {
    protected String name;
    protected BigDecimal amount;

    public Data(String name, BigDecimal amount) {
        this.name=name;
        this.amount=amount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public boolean findRicher(BigDecimal amount){
        return this.amount.compareTo(amount)<0;
    }
}
