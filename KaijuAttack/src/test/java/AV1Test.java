import Kaiju.Kaiju;
import Vehicles.AV1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AV1Test {
    AV1 av1;
    Kaiju kaiju;

    @Before
    public void before(){
        av1 = new AV1("Tank", 100);
    }

    @Test
    public void canAttack() {
        assertEquals("Launching rockets", av1.attack("rockets"));
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(100, av1.getHealthValue());
    }

}
