package org.jaylan;

import org.jaylan.bean.Factory;
import org.jaylan.bean.Tank;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void testGetTank(){
        Tank tank = (Tank) Factory.getWeapon("Tank");
        System.out.println(tank);

    }
}
