package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

public class MirrorTest {

    @Test
    public void stringWithMirror(){

        Mirror m = new Mirror();
        String result = m.mirrorEnds("abxyba");
        Assertions.assertEquals("ab",result);
    }

    @Test
    public void shortstringWithMirror(){

        Mirror m = new Mirror();
        String result = m.mirrorEnds("abca");
        Assertions.assertEquals("a",result);
    }

    @Test
    public void stringIsEqualToMirror(){

        Mirror m = new Mirror();
        String result = m.mirrorEnds("aba");
        Assertions.assertEquals("aba",result);
    }

    @Test
    public void stringIsEmpty(){

        Mirror m = new Mirror();
        String result = m.mirrorEnds("");
        Assertions.assertEquals("",result);
    }

    @Test
    public void NonMirrorString(){

        Mirror m = new Mirror();
        String result = m.mirrorEnds("abcde");
        Assertions.assertEquals("",result);
    }

    @Test
    public void twoLetterstring(){

        Mirror m = new Mirror();
        String result = m.mirrorEnds("aaaa");
        Assertions.assertEquals("aaaa",result);
    }
}
