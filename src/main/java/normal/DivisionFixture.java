package normal;

/**
 * Created by I074615 on 9/15/2017.
 */
public class DivisionFixture {
    private double numerator, denominator;

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public double quotient() {
        return numerator/denominator;
    }
}
