package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void gishappy(){
        GHappy g = new GHappy();
        boolean result = g.gHappy("xxggxx");
        Assertions.assertEquals(true,result);

    }

    @Test
    public void gisnothappy(){
        GHappy g = new GHappy();
        boolean result = g.gHappy("xxggxxgx");
        Assertions.assertEquals(false, result);

    }

    @Test
    public void gisabsent(){
        GHappy g = new GHappy();
        boolean result = g.gHappy("xxxxx");
        Assertions.assertEquals(false, result);

    }

}
