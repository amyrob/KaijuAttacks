import Kaiju.Dinoju;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinojuTest {
    Dinoju dinoju;

    @Before
    public void before() {
        dinoju = new Dinoju("Fluffy", 500, 25);
    }

        @Test
        public void canGetHealthValue() {
            assertEquals(500, dinoju.getHealthValue());
        }

        @Test
        public void canGetAttackValue() {
            assertEquals(25, dinoju.getAttackValue());
        }

        @Test
        public void CanAttack() {
            assertEquals("*Massive Stomp*", dinoju.attack("Stomp"));
        }


    }
