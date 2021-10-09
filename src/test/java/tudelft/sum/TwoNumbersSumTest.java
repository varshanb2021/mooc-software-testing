package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TwoNumbersSumTest {

    @Test
    public void addValidNumbers(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(5);
        TwoNumbersSum s = new TwoNumbersSum();
        ArrayList<Integer> result = s.addTwoNumbers(a,b);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(7);
        Assertions.assertIterableEquals(expected,result);

    }

    @Test
    public void addcarryforward(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(6);
        TwoNumbersSum s = new TwoNumbersSum();
        ArrayList<Integer> result = s.addTwoNumbers(a,b);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(1);
        Assertions.assertIterableEquals(expected,result);

    }

    @Test
    public void addThreedigitnumber(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(1);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(6);
        b.add(1);
        TwoNumbersSum s = new TwoNumbersSum();
        ArrayList<Integer> result = s.addTwoNumbers(a,b);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        Assertions.assertIterableEquals(expected,result);

    }
    @Test
    public void addTwoThreedigitnumber(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(9);
        a.add(5);
        a.add(1);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(6);
        b.add(1);
        TwoNumbersSum s = new TwoNumbersSum();
        ArrayList<Integer> result = s.addTwoNumbers(a,b);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(0);
        expected.add(1);
        expected.add(2);
        Assertions.assertIterableEquals(expected,result);

    }

    @Test
    public void addThreeThreedigitnumber(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(1);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(6);
        b.add(1);
        TwoNumbersSum s = new TwoNumbersSum();
        ArrayList<Integer> result = s.addTwoNumbers(a,b);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(0);
        expected.add(1);
        expected.add(2);
        Assertions.assertIterableEquals(expected,result);

    }
}
