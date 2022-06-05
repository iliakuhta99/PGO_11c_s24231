package PGO_05;

public class Plant extends Ingredient {
    private int toxicity;

    public Plant(String name, int baseReagent, int toxicity) {
        super(name, baseReagent);
        this.toxicity = toxicity;

    }

    @Override
    public int getReagent() {
        return super.baseReagent () * toxicity;
    }
}

