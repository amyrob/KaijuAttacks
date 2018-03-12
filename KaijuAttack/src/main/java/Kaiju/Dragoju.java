package Kaiju;

public class Dragoju extends Kaiju {

    public Dragoju(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);

    }
@Override
    public String roar() {
        return "Whhaaaaaaaaa";
    }
}
