public class Walczaca extends Postac{
    protected int sila;

    public int getSila() {
        return this.sila;
    }

    public void atakuj(Postac cel) {
        cel.punktyZycia -= this.sila;
    }
}
