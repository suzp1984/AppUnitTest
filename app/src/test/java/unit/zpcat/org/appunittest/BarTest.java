package unit.zpcat.org.appunittest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by moses on 6/30/15.
 */
public class BarTest {
    @Test
    public void testAdd() {
        Bar bar = new Bar();
        assertEquals(2, bar.add(1, 1));
    }
}
