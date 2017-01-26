import java.util.ArrayList;
import java.util.List;

public class PrimeTester {

    private static int upperLimit;
    private static int lowerLimit;

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public void testForPrime() {

        List<Integer> divisors = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();

        for (int primeTest = lowerLimit; primeTest <= upperLimit; primeTest++) {

            if(!(primeTest % 2 == 0)){
                
            }
        }

    }

}

