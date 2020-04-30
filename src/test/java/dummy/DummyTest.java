package dummy;

import jdk.internal.jline.internal.TestAccessible;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DummyTest {

    @Test
    public void testOne(){
        assertEquals(1,1);
    }
    @Test
    public void testTwo(){
        assertEquals(2,2);
    }
    @Test
    public void testThree(){
        assertEquals(3,3);
    }
}
