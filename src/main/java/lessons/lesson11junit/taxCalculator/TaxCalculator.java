package lessons.lesson11junit.taxCalculator;

import teacher.annotations.CodeReview;

import java.math.BigDecimal;

@CodeReview(approved = true)
public interface TaxCalculator {
    BigDecimal calculateTax(BigDecimal income);

}
