package unit.zpcat.org.appunittest;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Created by moses on 6/30/15.
 */
public class SumTest extends TestCase {

    @Test
    public void testSum() {
        Sum sum = new Sum();
        assertEquals(2, sum.add(1, 1));
    }
}
