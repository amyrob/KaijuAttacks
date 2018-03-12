import Kaiju.Dragoju;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragojuTest {
    Dragoju dragoju;

    @Before
    public void before() {
        dragoju = new Dragoju("Boris", 500, 25);
    }

    @Test
    public void canRoar() {
        assertEquals("Whhaaaaaaaaa", dragoju.roar());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(500, dragoju.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(25, dragoju.getAttackValue());
    }

    @Test
    public void CanAttack() {
        assertEquals("*Massive flames shoot out of mouth*", dragoju.attack("flames shoot out of mouth"));
    }
    
}
