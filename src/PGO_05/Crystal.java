package PGO_05;

public class Crystal extends Mineral {
    private int magicPower;

    public Crystal(String name, int baseReagent, int power, int magicPower) {
        super(name, baseReagent, power);
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;}

    @Override
    protected int getReagent() {
        return super.getReagent() + magicPower;
    }
}
