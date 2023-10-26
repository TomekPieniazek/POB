public class Pracownik {
    protected Pracownik przelozony;
    protected int pensja = 3600;

    public int getPensja() {
        return pensja;
    }

    public Pracownik getPrzelozony() {
        return this.przelozony;
    }

    public Pracownik(Pracownik przelozony){
        this.przelozony = przelozony;
        this.pensja = 3600;
    }

    public Pracownik(Pracownik przelozony, int pensja) {
        this.przelozony = przelozony;
        this.pensja = pensja;
    }
}
