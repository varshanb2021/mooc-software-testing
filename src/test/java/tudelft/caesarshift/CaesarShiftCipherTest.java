package tudelft.caesarshift;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void cipherwithshift1(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String result = cs.CaesarShiftCipher("the cat", 1);
        Assertions.assertEquals("uif dbu", result);
    }

    @Test
    public void cipherwithshiftminus1(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String result = cs.CaesarShiftCipher("the cat", -1);
        Assertions.assertEquals("sgd bzs", result);
    }

    @Test
    public void cipherinvalidchar(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String result = cs.CaesarShiftCipher("the cat!", 1);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void ciphershift26(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String result = cs.CaesarShiftCipher("the cat", 26);
        Assertions.assertEquals("the cat", result);
    }

    @Test
    public void ciphershift27(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String result = cs.CaesarShiftCipher("the cat", 27);
        Assertions.assertEquals("uif dbu", result);
    }
}
