package PGO_05;

public class Water extends Liquid {
    boolean distilated;

    public Water(String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        this.distilated = distilated;
    }

    @Override
    public int getReagent()
    {
        return super.getReagent();
    }
}
