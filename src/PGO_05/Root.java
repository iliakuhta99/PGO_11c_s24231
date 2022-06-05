package PGO_05;

public class Root extends Plant {
    public Root(String name, int baseReagent, int toxicity)
    {
        super(name, baseReagent, toxicity);
    }

    @Override
    private int getReagent()
    {
        return super.getReagent() / 2;
    }
}