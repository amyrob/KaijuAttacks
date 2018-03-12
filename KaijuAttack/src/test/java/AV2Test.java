import Vehicles.AV2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AV2Test {
    AV2 av2;

    @Before
    public void before() {
        av2 = new AV2("Stealth Bomber", 200);
    }

    @Test
    public void canGetType() {
        assertEquals("Stealth Bomber", av2.getType());
    }
}
