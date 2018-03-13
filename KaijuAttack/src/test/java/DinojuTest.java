import Kaiju.Dinoju;
import Vehicles.AV1;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinojuTest {
    Dinoju dinoju;
    AV1 av1;

    @Before
    public void before() {
        dinoju = new Dinoju("Fluffy", 500, 25);
        av1 = new AV1("Tank", 100);
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

        @Test
    public void canDealDamage() {
        dinoju.dealDamage(av1);
        assertEquals(75, av1.getHealthValue());
        }

    }
