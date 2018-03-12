package Kaiju;

import java.util.ArrayList;

public abstract class Kaiju implements IAttack {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar() {
        return "RooooooAAaaaRRRR";
    }

    @Override
    public String attack(String attackMethod) {
        return "*Massive " + attackMethod + "*";
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
