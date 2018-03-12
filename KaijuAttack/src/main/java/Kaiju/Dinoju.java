package Kaiju;

public class Dinoju extends Kaiju {
    public Dinoju(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }
    @Override
    public String roar() {
        return "Raaaaaarrrrr";
    }
}
