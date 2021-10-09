package tudelft.evennumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumberTest {

    @Test
    public void greaterThanEven() {
         new EvenNumber().findEvenOdd(30,200);
    }

    @Test
    public void greaterThanOdd() {
         new EvenNumber().findEvenOdd(33 ,103);
    }

    @Test
    public void lessThan() {
        new EvenNumber().findEvenOdd(10 ,90);
    }
}
