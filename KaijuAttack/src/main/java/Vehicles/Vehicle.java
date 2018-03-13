package Vehicles;

import Vehicles.IDamage;

public abstract class Vehicle implements IDamage {
    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    @Override
    public int takeDamage(int damageValue) {
        this.healthValue -= damageValue;
        return this.getHealthValue();
    }
}
