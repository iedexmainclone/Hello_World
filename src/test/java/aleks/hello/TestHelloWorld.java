package aleks.hello;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Created by Alex on 21.03.14.
 */
public class TestHelloWorld {

        @Test
        public  void printTest( )throws WrongString {
            HelloWorld hw = new HelloWorld();
            String s = null;
            try{
                hw.print(s);
                Assert.fail("You must enter a word!\nShould have thrown a WrongStringException");
            }catch (WrongString wr){
                Assert.assertEquals("You must enter a word!",wr.getMessage());
            }
        }
}
