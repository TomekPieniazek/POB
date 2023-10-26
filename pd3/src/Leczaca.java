public class Leczaca extends Postac{
    protected int moceLecznia;
    protected int sila;
    protected int mana;

    public void wylecz(Postac cel) {
        cel.punktyZycia += this.moceLecznia;
        this.mana -= 10;
    }

    public int getMana() {
        return this.mana;
    }
    public void atakuj(Postac cel) {
        cel.punktyZycia -= this.sila;
    }
}
