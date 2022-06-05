package PGO_05;

public class Ore extends Mineral {
    protected boolean metallic;

    public Ore(String name, int baseReagent, boolean metallic, int power) {
        super(name, baseReagent, power);
        this.metallic = metallic;
    }

    public int getReagent()
    {
        return super.getReagent();
    }
}

