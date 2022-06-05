package PGO_05;

import java.util.ArrayList;

class Eliksir {
    private String name;
    private boolean isCreated;
    private int power;
    private Liquid catalyst;
    ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Eliksir(String name, Liquid catalyst)
    {
        this.name = name;
        this.catalyst = catalyst;
    }

    public void addIngredient(Ingredient ingredient) {
        if(isCreated==false) {
            ingredients.add(ingredient);
        }
        else if(ingredient == null) {
            throw new RuntimeException("you cant add empty ingredient");
        }
        else
            throw new RuntimeException("Elixir created");
        }


    public void removeIngredient(Ingredient ingredient) {
        if(isCreated==false) {
            ingredients.remove(ingredient);
        }
        else{
            throw new RuntimeException("Elexir created");
        }
    }

    public void create() {
        this.isCreated = true;
        for(Ingredient i : this.ingredients) {
            this.power += i.getReagent();
        }
        this.power /= catalyst.baseReagent;
    }

    @Override
    public String toString() {
        return "Eliksir{" +
                "name='" + name + '\n' +
                ", isCreated=" + isCreated +
                ", catalyst=" + catalyst +
                ", power=" + power +
                ", ingredients=" + ingredients +
                '}';
    }
}

