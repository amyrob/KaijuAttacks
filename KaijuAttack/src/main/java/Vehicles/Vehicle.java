package Vehicles;

import Kaiju.IAttack;
import Kaiju.Kaiju;

public abstract class Vehicle implements IAttack {
    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    @Override
    public String attack(String attackMethod) {
        return "Launching " + attackMethod;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

}
