package lessons.lesson11.junit.taxCalculator;


import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {


        BigDecimal tax = BigDecimal.valueOf(0.00);
        BigDecimal range_20000 = BigDecimal.valueOf(20000.00);
        BigDecimal taxForRange_20000 = BigDecimal.valueOf(5000.00);


        int resultOfCompare = income.compareTo(range_20000);


        if (resultOfCompare==1) {
            tax = sumBD(taxForRange_20000, multBD(BigDecimal.valueOf(0.40),subBD(income,range_20000)));

        } else {tax =  income.multiply(BigDecimal.valueOf(0.25));}

        return tax.setScale(2);
    };

    private BigDecimal sumBD(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    private BigDecimal subBD(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }

    private BigDecimal multBD(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }
}
